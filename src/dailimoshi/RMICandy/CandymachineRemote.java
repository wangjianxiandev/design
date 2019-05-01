package dailimoshi.RMICandy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 18:57
 */

/**
 * 三个需要远程调用的方法
 */
public interface CandymachineRemote extends Remote {
    public String getLocation() throws RemoteException;
    public int getCount() throws  RemoteException;
    public State getState() throws RemoteException;//一定要序列化

}
