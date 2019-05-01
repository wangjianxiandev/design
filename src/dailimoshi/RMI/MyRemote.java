package dailimoshi.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 15:22
 */

/**
 * 本地要调用远程哪些方法，在服务端实现
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
