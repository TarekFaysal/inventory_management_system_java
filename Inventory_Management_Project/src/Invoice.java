import java.util.ArrayList;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class Invoice {
	
	double totalPrice=0;
	double discountPrice=0;
	
	ArrayList<StockableProduct> items = new ArrayList<>();
    ArrayList<Product> item = new ArrayList<>();
	
	LocalDateTime dateTime = LocalDateTime.now();
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String formatDateTime = dateTime.format(format);
	
	
	public Invoice() {
		
	}
	public String getLocalDateTime()
	{   
		return formatDateTime;
	}
	public void addProduct(Product product)
	{   
		item.add(product);
		totalPrice = product.getPrice()+totalPrice;
		discountPrice = product.getDiscount()+discountPrice;
		product.decreaseNumberOfItemsStockedByOne();
		
	}

	public void removeProduct (Product product)
	{
		if(totalPrice!=0)
		{item.remove(product);
		
		totalPrice = totalPrice-product.getPrice();
		discountPrice = discountPrice-product.getDiscount();
		items.get(product.getProductId()).increaseNumberOfItemsStockedByOne();}
		else
		{
			System.out.println("No product was added!");
		}
		
	}
	
	public double calculatePriceWithoutDiscount()
	{
		return totalPrice;
	}
	
	public boolean isFullHouseDiscountAvailable() {
		
		int gameCount=0;
		int musicCount=0;
		int movieCount=0;
		boolean fullHouseAvailable=false;
		for(Product product: this.item ){
			if(product instanceof Game){
				gameCount++;
			}
			else if(product instanceof Movie){
				movieCount++;
			}
			else{
				musicCount++;
			}
		}
		for (Product product : this.items) {
			if (product instanceof Game) {
				gameCount++;
			} else if (product instanceof Movie) {
				movieCount++;
			} else {
				musicCount++;
			}
		}
		fullHouseAvailable = movieCount>=2 || musicCount>=2 || gameCount>=2;
		return fullHouseAvailable;
	}
	public double calculateDiscountedPrice()
	{ double fDiscount=0;
	  double pDiscount=0;
		if (isFullHouseDiscountAvailable()==true)
		{
			fDiscount = 0.5*totalPrice;
		}
		else 
		{
			fDiscount = totalPrice;
		}
		pDiscount = totalPrice - discountPrice;
		if (pDiscount<=fDiscount)
		{
			return pDiscount;
		}
		else 
		{
			return fDiscount;
		}
		
	}
	public String getInvoice()
	{
		String str = "";
		for (int i = 0; i< this.item.size(); i++){
			str = str+item.get(i).getInfo();
		}
		for (Product product : this.items){
			str = str+product.getProductInfo();
		}
		return "Date: "+getLocalDateTime()+"\n"+str+ "\nTotal: "
							+this.totalPrice+" \nDiscount: "
							+(this.totalPrice-calculateDiscountedPrice())
							+" \nNeed to pay: "+calculateDiscountedPrice();
	}

	
}