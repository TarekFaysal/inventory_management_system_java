import java.util.ArrayList;

public class Inventory implements Iterable{
    Arraylist<StockableProduct> items;
    public void addItem(StockableProduct product){
        items.add(product);
    }
    public void removeItem(int productId){
        items.remove(productId);
    }
    public product getItem(int productId){
        items.get(productId);
    }
    public void addProductStock(int productId, int numberOfNewStock){
        items.get(productId).setNumberOfItemsStocked(numberOfNewStock);
    }
    


}