

public class Main {

	public static void main(String[] args) {
		
		GumballMachine gb1 = new GumballMachine(5, "Quarter", 25);

		System.out.println(gb1);

		gb1.insertCoin( 25);
		gb1.turnCrank();

		
		GumballMachine gb2 = new GumballMachine(5, "Two Quarter", 50);

		System.out.println(gb2);

		gb2.insertCoin( 25);
		gb2.insertCoin( 25);
		gb2.turnCrank();
		
		GumballMachine gb3 = new GumballMachine(5, "Any", 50);

		System.out.println(gb3);

		gb3.insertCoin( 25);
		gb3.insertCoin( 5);
		gb3.insertCoin( 20);
		gb3.turnCrank();
		
		

	}
}
