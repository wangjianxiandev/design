package celuemoshi;

import celuemoshi.Impl.FlyBehavior;
import celuemoshi.Impl.Swimbehavior;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-17
 * Time: 20:14
 */
public abstract class Duck {
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setSwimbehavior(Swimbehavior swimbehavior) {
        this.swimbehavior = swimbehavior;
    }

    FlyBehavior flyBehavior;
    Swimbehavior swimbehavior;
    public Duck(){

    }
    public void Fly(){
        flyBehavior.fly();
    }
    public void Swim(){
        swimbehavior.swim();
    }
    public abstract void display();
}
