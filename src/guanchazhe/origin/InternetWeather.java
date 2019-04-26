package guanchazhe.origin;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-14
 * Time: 13:14
 */
public class InternetWeather {
    public static void main(String[] args) {
        CurrentConditions currentConditions  = new CurrentConditions();
        Weather weather = new Weather(currentConditions);
        weather.setData(30,150,40);

    }
}
