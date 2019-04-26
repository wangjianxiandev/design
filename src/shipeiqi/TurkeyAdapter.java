package shipeiqi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-18
 * Time: 14:31
 */

//用户看到的是鸭子，但是在鸭子的对应方法中调用的是火鸡的方法，叫起来像火鸡，飞起来像鸭子
public class TurkeyAdapter implements Duck {
    private Turkey turkey;
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void gaga() {
        turkey.gogo();
    }

    @Override
    public void fly() {
        for(int i = 0;i<3;i++){
            turkey.fly();//因为鸭子飞的远，所以更改一部分
        }
    }
}
