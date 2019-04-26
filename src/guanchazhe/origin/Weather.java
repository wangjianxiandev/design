package guanchazhe.origin;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-14
 * Time: 13:06
 */
public class Weather {
    private float mTemperate;
    private float mPressure;
    private float mHumidity;
    private CurrentConditions currentConditions;
    public Weather(CurrentConditions currentConditions){
        this.currentConditions =  currentConditions;
    }
    public void dataChange(){
        currentConditions.update(getmTemperate(),getmPressure(),getmHumidity());
    }
    public float getmTemperate() {
        return mTemperate;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void setData(float mTemperate, float mPressure, float mHumidity){
        this.mTemperate = mTemperate;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }


}
