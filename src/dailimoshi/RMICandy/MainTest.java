package dailimoshi.RMICandy;

import java.rmi.Naming;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 19:18
 */
public class MainTest {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        try{
            CandymachineRemote candymachineRemote = (CandymachineRemote) Naming.lookup("rmi://127.0.0.1:6602/test1");
            monitor.addMachine(candymachineRemote);
            candymachineRemote = (CandymachineRemote) Naming.lookup("rmi://127.0.0.1:6602/test2");
            monitor.addMachine(candymachineRemote);
        }catch (Exception e){
            e.printStackTrace();
        }
        monitor.report();
    }
}
