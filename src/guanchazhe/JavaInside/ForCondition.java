package guanchazhe.JavaInside;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-14
 * Time: 15:18
 */
public class ForCondition implements Observer {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;
    @Override
    public void update(Observable arg0, Object arg1) {
        this.mTemperature = ((Weather.Data)(arg1)).mTemperate;
        this.mPressure = ((Weather.Data)(arg1)).mPressure;
        this.mHumidity = ((Weather.Data)(arg1)).mHumidity;
        display();
    }
    public void display(){
        System.out.println(mTemperature+1);
    }
}

