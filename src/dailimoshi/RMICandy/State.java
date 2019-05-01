package dailimoshi.RMICandy;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 19:05
 */
public interface State extends Serializable {
    public void insetCoin();
    public void returnCoin();
    public void turnCrank();
    public void dispense();
    public void printstate();
}
