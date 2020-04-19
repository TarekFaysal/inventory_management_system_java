
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
	
	return "\nName: " + getName() + " \nProductId: " + getProductId() + " \nPrice: " + getPrice() + " \nGenre: " + getGenre() + " \nyearPublished: " + getYearPublished() + " \nDiscount: " + getDiscount()+" \nNumber of items stocked:"+getnumberOfItemsStocked()+" \nDeveloper Name: "+ developer;
}

public String getProductInfo() {

	return "Name: " + getName() + " \nPrice: " + getPrice() + "\n";
}



}