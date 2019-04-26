package celuemoshi.ImplAble;

import celuemoshi.Impl.Swimbehavior;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-17
 * Time: 20:13
 */
public class GoodSwim implements Swimbehavior {

    @Override
    public void swim() {
        System.out.println("会游泳");
    }
}
