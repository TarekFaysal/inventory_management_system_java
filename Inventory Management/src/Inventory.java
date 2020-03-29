import java.util.ArrayList;
import java.util.Iterator;

public class Inventory implements Iterable<StockableProduct>{
    ArrayList<StockableProduct> items = new ArrayList<>();
    
    
    public Inventory() {
    	
    }
    
    public void addItem(StockableProduct product){
        items.add(product);
    }
    public void removeItem(int productId){
        items.remove(productId);
    }
    public StockableProduct getItem(int productId){
        return items.get(productId);
    }
    public void addProductStock(int productId, int numberOfNewStock){
        items.get(productId).setnumberOfItemsStocked(numberOfNewStock);
    }
    
    @Override
    public Iterator<StockableProduct> iterator() {
      return items.iterator();
    }

    
}
