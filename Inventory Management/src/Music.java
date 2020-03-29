  

public class Music extends StockableProduct {

	private String artistName;
	public Music() {
		
	}

	public Music(String artistName) 
    {
		super();
		this.artistName = artistName;
	}
	public Music(String artistName,int numberOfItemsStocked,String name, int productId, double price, String genre, int yearPublished, double discount) 
    {
		super(numberOfItemsStocked,name,productId,price,genre,yearPublished,discount);
		this.artistName = artistName;
	}
	
	public String getArtistName()
	{
		return this.artistName;
	}
	public void setArtistName(String artistName)
	{
		this.artistName = artistName;
	}
	public String toString()
	{
		return "Artist's name is: "+artistName;
	}
	@Override
	public String getInfo() {
		 return "name: " + getName() + " ProductId: " + getProductId() + " Price: " + getPrice() + " Genre: " + getGenre() + " yearPublished: " + getYearPublished() + " Discount: " + getDiscount()+" Number of items stocked:"+getnumberOfItemsStocked()+" Artist Name: "+ artistName;
    }
	}
	


