
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		StockableProduct game = new Game("Fatehin",500,"Clash Of Clan",1,1000,"Strategy",2005,600);
		StockableProduct game3 = new Game("Tarek", 500, "PUBG", 2, 500, "War", 2010, 100);
		StockableProduct game2 = new Game("Fatehin");

		
		Inventory inv = new Inventory();
		inv.addItem(game);
		inv.addItem(game2);
		
		
		
		

		Invoice invc = new Invoice();
		invc.addProduct(game);
		invc.addProduct(game3);
		System.out.println(invc.getInvoice());

	}

}
