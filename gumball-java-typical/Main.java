

public class Main {

	public static void main(String[] args) {
		
		GumballMachine gb1 = new GumballMachine(10, 25, "Quarter");

		System.out.println(gb1);

		gb1.insertCoin( 25 );
		gb1.turnCrank();
		gb1.insertCoin( 5 );
		gb1.turnCrank();

		GumballMachine gb2 = new GumballMachine(10, 50, "Two Quarter");

		System.out.println(gb2);

		gb2.insertCoin( 25 );
		gb2.insertCoin( 25 );
		gb2.turnCrank();
		gb2.insertCoin( 5 );
		gb2.turnCrank();

		GumballMachine gb3 = new GumballMachine(10, 50, "Any");

		System.out.println(gb3);

		gb3.insertCoin( 25 );
		gb3.insertCoin( 25 );
		gb3.turnCrank();
		gb3.insertCoin( 5 );
		gb3.insertCoin( 25 );
		gb3.insertCoin( 10 );
		gb3.insertCoin( 10 );
		gb3.turnCrank();
		gb3.insertCoin( 10 );
		gb3.turnCrank();

	}
}
