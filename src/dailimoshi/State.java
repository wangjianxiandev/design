package dailimoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 14:06
 */
public interface State {
    public void insetCoin();
    public void returnCoin();
    public void turnCrank();
    public void dispense();
    public void printstate();
}
