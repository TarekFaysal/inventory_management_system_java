public abstract class StockableProduct extends Product {

	private int numberOfItemsStocked;
	public StockableProduct() {
		
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
	
	

}