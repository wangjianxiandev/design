package guanchazhe.JavaInside;

import java.util.Observable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-14
 * Time: 14:55
 */
public class Weather extends Observable {
    private float mTemperate;
    private float mPressure;
    private float mHumidity;

    public void dataChange(){
        this.setChanged();//一定要做这一步，在源码中是一个boolean变量，set之后就为true，增加灵活性，比如更改十分小，这时候就可以不用设置
        this.notifyObservers(new Data(getmTemperate(), getmPressure(),getmHumidity()));//同步直接将信息推送给观察者
//        this.notifyObservers();//无参，单纯告诉观察者有信息变更，自行来获取
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
    public class Data{
        public float mTemperate;
        public float mPressure;
        public float mHumidity;
        public Data(float mTemperate, float mPressure, float mHumidity){
            this.mTemperate = mTemperate;
            this.mPressure = mPressure;
            this.mHumidity = mHumidity;
        }
    }

}
