import java.util.ArrayList;
import java.util.Iterator;

public class Invoice {
	
	
	ArrayList<StockableProduct> items = new ArrayList<>();
	
	public boolean isFullHouseDiscountAvailable() {
		
		int[] countItem = new int[] {0,0,0};
		boolean fullHouseAvailable;
		
		Iterator<StockableProduct> itr = items.iterator();
		
		while(itr.hasNext()) {
			if (itr.next() instanceof Game) {
				countItem[0] += countItem[0];
			}
			else if (itr.next() instanceof Music) {
				countItem[1] += countItem[1];
			}
			else if (itr.next() instanceof Movie) {
				countItem[2] += countItem[2];
			}
		}
		
		if (countItem[0]>= 2 && countItem[1]>= 2 && countItem[2]>= 2) {
			fullHouseAvailable = true;
		}else {
			fullHouseAvailable = false;
		}
		return fullHouseAvailable;
	}

	public Invoice() {
		// TODO Auto-generated constructor stub
	
	}

}