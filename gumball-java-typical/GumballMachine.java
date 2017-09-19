
public class GumballMachine
{

    private int num_gumballs;
    private boolean has_coins;
    private int coinSum=0;
    private String coinAccepted;
    private int costOfGumball;

    public GumballMachine( int numberGumballs, int costOfGumball, String coinAccepted )
    {
        // initialize instance variables
        this.num_gumballs = numberGumballs;
        this.has_coins = false;
        this.costOfGumball=costOfGumball;
        this.coinAccepted=coinAccepted;
        
    }

    public void insertCoin(int coin)
    {
        
        if ( coin==25 && (coinAccepted.equals("Two Quarter") || coinAccepted.equals("Quarter"))) 
            coinSum+=coin;
        else if( coinAccepted.equals("Any") )
            coinSum+=coin;

        if( coinSum == costOfGumball ){
            this.has_coins = true ;
        	coinSum=0;
        }
        else 
            this.has_coins = false ;
    }
    
    public void turnCrank()
    {
    	if ( this.has_coins )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_coins = false ;
    			System.out.println( "Thanks for inserting the coin.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your coin." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert "+ this.coinAccepted+" coins" ) ;
    	}        
    }
    
    
}
