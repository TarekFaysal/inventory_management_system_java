public abstract class Movie extends StockableProduct {

	private String directorName;
	public Movie() {
		
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
	public abstract String getInfo();

}