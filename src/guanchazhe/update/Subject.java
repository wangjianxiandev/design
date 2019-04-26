package guanchazhe.update;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-14
 * Time: 14:07
 */
public interface Subject {
    public void registerObserver(Observer observer);//注册观察者
    public void removeObserver(Observer observer);//删除观察者
    public void notifyObservers();//通知观察者
}
