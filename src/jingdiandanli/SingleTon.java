package jingdiandanli;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-16
 * Time: 10:01
 */
public class SingleTon {
    private static SingleTon uniqueInstance = null;
    private SingleTon(){

    }
    public static SingleTon getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SingleTon();
        }
        return uniqueInstance;
    }
}
