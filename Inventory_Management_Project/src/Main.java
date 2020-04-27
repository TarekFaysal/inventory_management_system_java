import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		StockableProduct game = new Game("Fatehin",500,"Clash Of Clan",1,1000,"Strategy",2005,600);
		StockableProduct game2 = new Game("Tarek", 500, "PUBG", 2, 500, "War", 2010, 100);
		
		
		StockableProduct m1 = new Music("Justin",6,"Submarine",1,20.0,"Pop",2020,3);
		StockableProduct m2 = new Music("Justin",7,"AM",1,10.0,"Pop",2020,5);
		StockableProduct v1 = new Movie("Daddy",9,"Good will Hunting",1,12.0,"Crime",2020,4);
		StockableProduct v2 = new Movie("Justin",7,"Life is Beautiful",1,20.0,"Crime",2020,5);
		StockableProduct g1 = new Game("Faysal",4,"Red Dead Redemption",1,29.0,"Sports",2020,3);
		StockableProduct g2 = new Game("Tarek", 3, "God of War", 2, 12.0, "War", 2010, 7);
		
		Inventory inv = new Inventory();
		inv.addItem(v1);
		inv.addItem(v2);
		inv.addItem(m1);
		inv.addItem(m2);
		inv.addItem(g1);
		inv.addItem(g2);
		//1
		System.out.println("\nDemo of Question 1: \n");
		Iterator<StockableProduct> iterator = inv.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next().getInfo());
		}

		//2		
		System.out.println("\nDemo of Question 2: \n");
		Invoice invc = new Invoice();
		invc.addProduct(m1);
		invc.addProduct(m2);
		invc.addProduct(v1);
		invc.addProduct(v2);
		invc.addProduct(g1);

		System.out.println(invc.getInvoice()); 
		
		//3
		System.out.println("\nDemo of Question 3: \n");
		Invoice invc2 = new Invoice();
		invc2.addProduct(m1);
		invc2.addProduct(m2);
		invc2.addProduct(v1);
		invc2.addProduct(v2);
		invc2.addProduct(g1);
		invc2.addProduct(g2);
		System.out.println(invc2.getInvoice()); 
		//4
		System.out.println("\nDemo of Question 4: \n");
		Iterator<StockableProduct> iterator2 = inv.iterator();
		Product p;
		while(iterator2.hasNext()){
			p = iterator2.next();
			if (p instanceof Game) {
				System.out.println(p.getName());
			}
					
		}
		//5
		System.out.println("\nDemo of Question 5: \n");
		Iterator<StockableProduct> iterator3 = inv.iterator();
		ArrayList<Product> product = new ArrayList<Product>();
		Product pd;
		while(iterator3.hasNext()){
			pd = iterator3.next();
			if(pd instanceof Music) {
				
				product.add(pd);
				
			}
		}
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if(p1.getPrice() < p2.getPrice() ){
                    return -1;
                } else if (p1.getPrice() > p2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(product, comparator);
        System.out.println(product.get(0).getProductInfo());
		
		
		
		
		//6
		System.out.println("\nDemo of Question 6: \n");
		Iterator<StockableProduct> iterator4 = inv.iterator();
		Product pl;
		while(iterator4.hasNext()){
			pl = iterator4.next();
			if (pl instanceof Movie && ((Movie) pl).getdirectorName()== "Justin") {
				System.out.println(pl.getName());
			}
		
		}
		//7
		System.out.println("\nDemo of Question 7: \n");

		StockableProduct ps;
		Iterator<StockableProduct> iterator5 = inv.iterator();
		while(iterator5.hasNext()){
			ps = iterator5.next();
			if (ps instanceof Music) {
				System.out.println("Name: "+ps.getName()+", Catagory: Music, Item Availavle: "+ps.getnumberOfItemsStocked());
			}
			if (ps instanceof Movie) {
				System.out.println("Name: "+ps.getName()+", Catagory: Movie, Item Availavle: "+ps.getnumberOfItemsStocked());
			}
			if (ps instanceof Game) {
				System.out.println("Name: "+ps.getName()+", Catagory: Game, Item Availavle: "+ps.getnumberOfItemsStocked());
			}
			
	
			
		}
		

	}

}
