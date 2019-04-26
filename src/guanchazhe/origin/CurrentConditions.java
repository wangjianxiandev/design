package guanchazhe.origin;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-14
 * Time: 13:08
 */
public class CurrentConditions {
    private float mTempature;
    private float mPressure;
    private float mHumidity;
    public void update(float mTempature, float mPressure, float mHumidity){
        this.mTempature = mTempature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        display();
    }
    public void display(){
        System.out.println("温度"+mTempature);
        System.out.println("气压"+mPressure);
        System.out.println("湿度"+mHumidity);
    }
}
