package guanchazhe.update;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-14
 * Time: 14:23
 */
public class InternetWeather {
    public static void main(String[] args) {
        CurrentConditions currentConditions;
        ForcastConditions forcastConditions;
        Weather weather;
        weather = new Weather();
        currentConditions = new CurrentConditions();
        forcastConditions  = new ForcastConditions();

        //注册观察者
        weather.registerObserver(currentConditions);
        weather.registerObserver(forcastConditions);
        weather.setData(30,150,40);
        weather.removeObserver(forcastConditions);
        weather.setData(30, 120,40);
    }

}
