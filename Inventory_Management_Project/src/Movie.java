
public class Movie extends StockableProduct {

	private String directorName;
	public Movie() {
		
	}
	public Movie(String directorName) 
    {
		super();
		this.directorName = directorName;
	}
	public Movie(String directorName,int numberOfItemsStocked,String name, int productId, double price, String genre, int yearPublished, double discount) 
    {
		super(numberOfItemsStocked,name,productId,price,genre,yearPublished,discount);
		this.directorName = directorName;
	}
	public String getdirectorName()
	{
		return this.directorName;
	}
	public void setdirectorName(String directorName)
	{
		this.directorName = directorName;
	}
	public String toString()
	{
		return "director's name is: "+directorName;
	}
	@Override
	public String getInfo() {
		return "\nName: " + getName() + " \nProductId: " + getProductId() + "\n Price: " + getPrice() + "\n Genre: " + getGenre() + "\n yearPublished: " + getYearPublished() + "\n Discount: " + getDiscount()+"\n Number of items stocked:"+getnumberOfItemsStocked()+"\n Director Name: "+ directorName;
	}
	public String getProductInfo() {

		return "\nName: " + getName() + " Price: " + getPrice() + "";
	}

}