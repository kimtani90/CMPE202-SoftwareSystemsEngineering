

public class NoMoneyState implements State {
    GumballMachine gumballMachine;
 
    public NoMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
            

            System.out.println("You inserted a coin");
            if(coin==25 && (gumballMachine.coinAccepted.equals("Quarter")||gumballMachine.coinAccepted.equals("Two Quarter")))
            {
                gumballMachine.currentValue+=coin;
                
            }
            else if(gumballMachine.coinAccepted.equals("Any"))
            {
                gumballMachine.currentValue+=coin;
            }
            
            if(gumballMachine.currentValue==gumballMachine.costOfGumball)
            {
                gumballMachine.setState(gumballMachine.getHasMoneyState());
            }
            else
            {
                gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
            }
            
            
    }
 
    public void ejectCoin() {
        System.out.println("You haven't inserted a Coins");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no money");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for coins";
    }
}
