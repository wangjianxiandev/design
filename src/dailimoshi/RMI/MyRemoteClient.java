package dailimoshi.RMI;

import java.rmi.Naming;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 15:27
 */

/**
 * 客户端拿到接口
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }
    public void go(){
        try{
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1:6600/RemoteHello");//通过naming查找服务
            String s = service.sayHello(); //客户端调用sayHello是通过rmi调用远程的方法实现远程调用
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
