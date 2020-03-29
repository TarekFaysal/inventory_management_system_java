public abstract class StockableProduct extends Product implements Stockable{

	private int numberOfItemsStocked;
	public StockableProduct() {
		super();
	}
	public StockableProduct(int numberOfItemsStocked) {
		super();
		 this.numberOfItemsStocked = numberOfItemsStocked;
		
	}
	public StockableProduct(int numberOfItemsStocked,String name, int productId, double price, String genre, int yearPublished, double discount) {
		super(name,productId,price,genre,yearPublished,discount);
		 this.numberOfItemsStocked = numberOfItemsStocked;
		
	}
	public int getnumberOfItemsStocked()
	{
		return numberOfItemsStocked;
	}
	public void setnumberOfItemsStocked(int numberOfItemsStocked)
	{
		this.numberOfItemsStocked = numberOfItemsStocked;
	}
	public String toString()
	{
		return "Number of Item Stocked: "+ numberOfItemsStocked;
	}
	
	public void addStock(int num) {
		this.numberOfItemsStocked = this.numberOfItemsStocked + num;
		
	}
	public void removeStock(int num) {
		if (this.numberOfItemsStocked - num > 0 ) {
			this.numberOfItemsStocked = this.numberOfItemsStocked - num;
		}else {
			System.out.println("Not enough item in stock");
		}
		
	}
	public void editStock(int num) {
		if(num>=0) {
			this.numberOfItemsStocked = num;
		}else {
			System.out.println("Stock number can not be negative");
		}
}
	public void decreaseNumberOfItemsStockedByOne() {
		
		if (this.numberOfItemsStocked -1 > 0 ) {
			this.numberOfItemsStocked = this.numberOfItemsStocked -1;
		}else {
			System.out.println("Not enough item in stock");
		}
		
	}
	public void increaseNumberOfItemsStockedByOne() {
		this.numberOfItemsStocked++;
	}
	
	

}