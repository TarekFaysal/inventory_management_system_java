import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		StockableProduct game = new Game("Fatehin",500,"Clash Of Clan",1,1000,"Strategy",2005,600);
		StockableProduct game2 = new Game("Tarek", 500, "PUBG", 2, 500, "War", 2010, 100);
		
		
		StockableProduct m1 = new Music("Justin",5,"Submarine",1,20.0,"Pop",2020,3);
		StockableProduct m2 = new Music("Justin",5,"AM",1,10.0,"Pop",2020,5);
		StockableProduct v1 = new Movie("Daddy",5,"Good will Hunting",1,12.0,"Crime",2020,4);
		StockableProduct v2 = new Movie("Justin",5,"Life is Beautiful",1,20.0,"Crime",2020,5);
		StockableProduct g1 = new Game("Faysal",5,"Red Dead Redemption",1,29.0,"Sports",2020,3);
		StockableProduct g2 = new Game("Tarek", 500, "God of War", 2, 12.0, "War", 2010, 7);
		//1
		Inventory inv = new Inventory();
		inv.addItem(m1);
		inv.addItem(m2);
		inv.addItem(v1);
		inv.addItem(v2);
		inv.addItem(g1);
		inv.addItem(g2);
		
		Iterator<StockableProduct> iterator = inv.iterator();
		
				/*while(iterator.hasNext()){
				System.out.println(iterator.next().getInfo());
				}*/

		//2		
		/*Invoice invc = new Invoice();
		invc.addProduct(m1);
		invc.addProduct(m2);
		invc.addProduct(v1);
		invc.addProduct(v2);
		invc.addProduct(g1);

		System.out.println(invc.getInvoice()); */
		
		//3
		/*Invoice invc2 = new Invoice();
		invc.addProduct(m1);
		invc.addProduct(m2);
		invc.addProduct(v1);
		invc.addProduct(v2);
		invc.addProduct(g1);
		invc.addProduct(g2);
		System.out.println(invc.getInvoice()); */
		//4
		/*Product p;
		while(iterator.hasNext()){
			p = iterator.next();
			if (p instanceof Game) {
				System.out.println(p.getName());
			}
					
		}*/
		//5
		//inv.sortByPrice();
		
		/*while(iterator.hasNext()){
		System.out.println(iterator.next().getInfo());
		}*/
		//6
		/*Product p;
		while(iterator.hasNext()){
			p = iterator.next();
			if (p instanceof Movie && ((Movie) p).getdirectorName()== "Justin") {
				System.out.println(p.getName());
			}
		
		}*/
		

	}

}
