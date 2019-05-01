package dailimoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 14:05
 */
public class OnReadyState implements State {
    private CandyMachine candyMachine;
    public OnReadyState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    @Override
    public void insetCoin() {
        System.out.println("You hava inserted a coin please turn the crank!");
        //插入后有硬币
        candyMachine.setState(candyMachine.hasCoin);
    }

    @Override
    public void returnCoin() {
        System.out.println("未插入不可反回");
    }

    @Override
    public void turnCrank() {
        System.out.println("you  turned, but you haven't inserted a coin");
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printstate() {
        System.out.println("****OnReadyState*****");
    }
}

