package celuemoshi.ImplAble;

import celuemoshi.Impl.FlyBehavior;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-17
 * Time: 20:12
 */
public class BadFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
