package guanchazhe.update;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-14
 * Time: 14:11
 */
public class ForcastConditions  implements Observer {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    @Override
    public void update(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        display();
    }
    public void display(){
        System.out.println("明温度" + mTemperature+1);
        System.out.println("明气压"+ mPressure+1);
        System.out.println("明湿度" + mHumidity+1);
    }
}
