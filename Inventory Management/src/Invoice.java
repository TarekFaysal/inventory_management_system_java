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
		items.get(product.getProductId()).decreaseNumberOfItemsStockedByOne();
		
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
		
		int[] countItem = new int[] {0,0,0};
		boolean fullHouseAvailable;
		
		Iterator<StockableProduct> itr = items.iterator();
		
		while(itr.hasNext()) {
			if (itr.next() instanceof Game) {
				countItem[0] += 1;
			}
			else if (itr.next() instanceof Music) {
				countItem[1] += 1;
			}
			else if (itr.next() instanceof Movie) {
				countItem[2] += 1;
			}
		}
		
		if (countItem[0]>= 2 && countItem[1]>= 2 && countItem[2]>= 2) {
			fullHouseAvailable = true;
		}else {
			fullHouseAvailable = false;
		}
		return fullHouseAvailable;
	}
	public double calculateDiscountedPrice()
	{ double fDiscount;
	  double pDiscount;
		if (isFullHouseDiscountAvailable()==true)
		{
			fDiscount = 0.5*totalPrice;
		}
		else 
		{
			fDiscount = totalPrice;
		}
		pDiscount = totalPrice - discountPrice;
		if (pDiscount>=fDiscount)
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
		return "Date: "+getLocalDateTime()+"\nName: ";
	}

	
}