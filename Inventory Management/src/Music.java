  

public abstract class Music {

	private String artistName;
	public Music() {
		
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
	public abstract String getInfo();


}