package zhuangtaimoshi.old;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-29
 * Time: 14:41
 */
public class MainTest {
    public static void main(String[] args) {
        CandyMachine candyMachine = new CandyMachine(1);
        candyMachine.printState();
//        System.out.println(candyMachine.getState());
        candyMachine.insertCoin();
//        System.out.println(candyMachine.getState());
        candyMachine.printState();
//        System.out.println(candyMachine.getState());
        candyMachine.turnCrank();
        candyMachine.printState();
        candyMachine.insertCoin();
        candyMachine.printState();
    }
}
