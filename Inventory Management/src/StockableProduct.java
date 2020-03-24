public class StockableProduct {

	private int numberOfItemsStocked;
	public StockableProduct() {
		
	}
	public StockableProduct(int numberOfItemsStocked) {
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