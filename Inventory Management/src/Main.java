
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello");
		StockableProduct game = new Game("Tarek");
		StockableProduct game2 = new Game("Fatehin");

		
		Inventory inv = new Inventory();
		inv.addItem(game);
		inv.addItem(game2);
		
		for (StockableProduct i: inv) {
			System.out.println(i.getInfo());
		}
		
		System.out.print(inv.getClass());
	}

}
