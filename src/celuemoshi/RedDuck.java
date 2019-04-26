package celuemoshi;

import celuemoshi.Impl.FlyBehavior;
import celuemoshi.Impl.Swimbehavior;
import celuemoshi.ImplAble.GoodFly;
import celuemoshi.ImplAble.GoodSwim;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-17
 * Time: 20:16
 */
public class RedDuck extends Duck {
    FlyBehavior flyBehavior;
    Swimbehavior swimbehavior;
    public RedDuck(){
        flyBehavior = new GoodFly();
        swimbehavior = new GoodSwim();
        setSwimbehavior(swimbehavior);
        setFlyBehavior(flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("我是红头鸭");
    }
}
