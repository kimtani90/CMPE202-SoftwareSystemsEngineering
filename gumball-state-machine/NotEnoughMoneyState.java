
/**
 * Write a description of class NotEnoughMoney here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NotEnoughMoneyState implements State
{
        GumballMachine gumballMachine;
 
    public NotEnoughMoneyState(GumballMachine gumballMachine) {
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
        System.out.println("Coins returned");
        gumballMachine.setState(gumballMachine.getNoMoneyState());
    }
 
    public void turnCrank() {
        System.out.println("You turned but there is not enough money");
        
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for more coins";
    }
}


