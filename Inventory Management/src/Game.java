public class Game extends StockableProduct {
 private String developer;
	public Game() {
		
	}
public  Game(String developer) {
	super();
	this.developer = developer;
		
	}
public Game(String developer,int numberOfItemsStocked,String name, int productId, double price, String genre, int yearPublished, double discount) 
{
	super(numberOfItemsStocked,name,productId,price,genre,yearPublished,discount);
	this.developer = developer;
}

public String getDeveloper()
{
	return developer;
}
public void setDeveloper(String developer)
{
	this.developer = developer;
}
public String toString()
{
	return "Developer's name is: "+developer;
}
@Override
public String getInfo() {
	
	return "name: " + getName() + " ProductId: " + getProductId() + " Price: " + getPrice() + " Genre: " + getGenre() + " yearPublished: " + getYearPublished() + " Discount: " + getDiscount()+" Number of items stocked:"+getnumberOfItemsStocked()+" Developer: "+ developer;
}



}