
public abstract class Product {

    private String name;
    private int productId;
    private double price;
    private String genre;
    private int yearPublished;
    private double discount;
    public Product() {
    	
    }
    public Product(String name, int productId, double price, String genre, int yearPublished, double discount){
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.discount = discount;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getProductId(){
        return productId;
    }
    public void setProductId(int productId){
        this.productId = productId;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    public void setYearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }
    public double getDiscount(){
        return discount;
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }
    public abstract String getInfo();
    public String toString(){
        return "name: " + name + " ProductId: " + productId + " Price: " + price + "Genre: " + genre + "yearPublished: " + yearPublished + "Discount: " + discount;
    }
    abstract public void decreaseNumberOfItemsStockedByOne();
    abstract public String getProductInfo();
}