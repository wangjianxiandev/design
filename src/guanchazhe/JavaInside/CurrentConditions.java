package guanchazhe.JavaInside;

import java.util.Observable;
import java.util.Observer;
import guanchazhe.JavaInside.Weather.Data;

/**
 *
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-14
 * Time: 15:04
 */
public class CurrentConditions implements Observer {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;
    @Override
    public void update(Observable arg0, Object arg1) {
        this.mTemperature = ((Data)(arg1)).mTemperate;
        this.mPressure = ((Data)(arg1)).mPressure;
        this.mHumidity = ((Data)(arg1)).mHumidity;
        display();
    }
    public void display(){
        System.out.println(mTemperature);
    }
}
