package guanchazhe.update;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-14
 * Time: 14:12
 */
public class Weather implements Subject {
    private float mTemperate;
    private float mPressure;
    private float mHumidity;
    //定义观察者列表
    private ArrayList<Observer> mObservers;

    public Weather(){
        mObservers = new ArrayList<Observer>();
    }

    public void dataChange(){
        //通知是要放到数据改变中
        notifyObservers();
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
    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(mObservers.contains(observer)){
            mObservers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        //通知所有对象有新的信息,获取每一个对象更新
        for(int i = 0;i<mObservers.size();i++){
            mObservers.get(i).update(getmTemperate(), getmPressure(),getmHumidity());
        }
    }
}
