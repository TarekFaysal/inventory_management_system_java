import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    
    public void sortByPrice() {
    	Collections.sort(items, new Comparator<StockableProduct>(){
    		public int compare(StockableProduct s1, StockableProduct s2) {
    			int s1Price = (int)(s1.getPrice());
    			int s2Price = (int)(s2.getPrice());
    			return Integer.valueOf(s1Price).compareTo(s2Price);
    		}
    	});
    }
    public void sortByAvailableStock() {
    	Collections.sort(items, new Comparator<StockableProduct>(){
    		public int compare(StockableProduct s1, StockableProduct s2) {
    			
    			return Integer.valueOf(s1.getnumberOfItemsStocked()).compareTo(s2.getnumberOfItemsStocked());
    		}
    	});
    }
    
    @Override
    public Iterator<StockableProduct> iterator() {
      return items.iterator();
    }

    
}
