package zhuangtaimoshi.newTest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-29
 * Time: 19:18
 */
public class MainTest {
    public static void main(String[] args) {
        CandyMachine candyMachine = new CandyMachine(5);
        candyMachine.printState();
        candyMachine.insertCoin();
        candyMachine.printState();
        candyMachine.turnCrank();
        candyMachine.printState();


        candyMachine.insertCoin();
        candyMachine.printState();
        candyMachine.turnCrank();
        candyMachine.printState();

    }
}
