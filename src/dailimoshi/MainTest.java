package dailimoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 14:15
 */
public class MainTest {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        CandyMachine candyMachine1 = new CandyMachine("NY", 6);
        monitor.addMachine(candyMachine1);

        CandyMachine candyMachine2 = new CandyMachine("TK", 4);
        candyMachine2.insertCoin();
        monitor.addMachine(candyMachine2);


        CandyMachine candyMachine3 = new CandyMachine("Bj", 4);
        candyMachine3.insertCoin();
        candyMachine3.turnCrank();
        monitor.addMachine(candyMachine3);

        monitor.report();
    }
}
