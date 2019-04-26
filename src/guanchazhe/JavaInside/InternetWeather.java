package guanchazhe.JavaInside;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-14
 * Time: 15:16
 */
public class InternetWeather {
    public static void main(String[] args) {
        CurrentConditions currentConditions;
        ForCondition forCondition;
        currentConditions = new CurrentConditions();
        forCondition = new ForCondition();
        Weather weather = new Weather();
        //注册观察者,但是注册的顺序和统治的顺序是反的，也就是说先注册的后通知
        weather.addObserver(currentConditions);
        weather.addObserver(forCondition);

        weather.setData(10,120,30);
        weather.deleteObserver(forCondition);
        weather.setData(20, 130,50);
    }
}
