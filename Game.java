
public class Game extends StockableProduct {
 private String developer;
	public Game() {
		
	}
public  Game(String developer) {
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
public String getInfo()
{
	return "Developer's name is: "+developer;
}


}
