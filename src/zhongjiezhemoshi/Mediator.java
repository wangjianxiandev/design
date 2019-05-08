package zhongjiezhemoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-08
 * Time: 20:36
 */
public interface Mediator {
    public abstract void Register(String colleagueName, Colleague colleague);
    public abstract void GetMessage(int stateChange, String colleagueName);
    public abstract void SendMessage();
}
