package dailimoshi.RMI;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 15:24
 */

/**
 * 服务端实现接口，注册服务到某一个端口
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException{
        super();
    }
    @Override
    public String sayHello() throws RemoteException {
        return "hello world";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();//注册服务
            LocateRegistry.createRegistry(6600);//绑定端口
            Naming.rebind("RemoteHello", service);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
