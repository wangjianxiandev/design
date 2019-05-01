package dailimoshi.RMICandy;

import java.rmi.Naming;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 19:14
 */
/*
服务端
 */
public class RemoteMainTest {
    public static void main(String[] args) {
        try{
            CandyMachine sevice = new CandyMachine("test1", 7);
            Naming.rebind("rmi://127.0.0.1:6602/test1", sevice);
            sevice.insertCoin();
            sevice = new CandyMachine("test2",5);
            Naming.rebind("rmi://127.0.0.1:6602/test2",sevice);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
