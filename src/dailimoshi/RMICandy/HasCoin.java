package dailimoshi.RMICandy;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 19:06
 */
public class HasCoin implements State {
    private CandyMachine candyMachine;
    public HasCoin(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }
    @Override
    public void insetCoin() {
        System.out.println("you can not insert another one");
    }

    @Override
    public void returnCoin() {
        System.out.println("coin return");
        candyMachine.setState(candyMachine.onReadyState);
    }

    @Override
    public void turnCrank() {
        System.out.println("crank turn...!");
        int random = (int)Math.random()*10;
        //加入赢家状态
        if(random == 1){
            candyMachine.setState(candyMachine.winnerState);
        }else{
            candyMachine.setState(candyMachine.soldState);
        }
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printstate() {
        System.out.println("****HasCoin****");
    }
}
