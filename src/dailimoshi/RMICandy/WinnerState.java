package dailimoshi.RMICandy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 19:08
 */
public class WinnerState implements State {
    private CandyMachine candyMachine;
    public WinnerState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }
    @Override
    public void insetCoin() {
        System.out.println("please wait we are giving you another candy");
    }

    @Override
    public void returnCoin() {
        System.out.println("please  wait we are giving you another candy");
    }

    @Override
    public void turnCrank() {
        System.out.println(" please wait we are giving you another candy");
    }

    @Override
    public void dispense() {
        candyMachine.releaseCandy();
        if (candyMachine.getCount() == 0) {
            candyMachine.setState(candyMachine.soldOutState);
        } else {
            System.out.println(" please wait we are giving you another candy");
            candyMachine.releaseCandy();
            if (candyMachine.getCount() > 0) {
                candyMachine.setState(candyMachine.onReadyState);
            } else {
                System.out.println("Out of candies");
                candyMachine.setState(candyMachine.soldOutState);
            }
        }
    }

    @Override
    public void printstate() {
        System.out.println("****WinnerState*****");
    }
}