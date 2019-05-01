package zhuangshizhe.putongzhaungshi;

import zhuangshizhe.putongzhaungshi.Component.Decaf;
import zhuangshizhe.putongzhaungshi.Component.Drink;
import zhuangshizhe.putongzhaungshi.Component.Espresso;
import zhuangshizhe.putongzhaungshi.Decorator.Chocolate;
import zhuangshizhe.putongzhaungshi.Decorator.Milk;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-15
 * Time: 18:39
 */
public class cofferBar {
    public static void main(String[] args) {
        Drink order;
        order = new Decaf();
        System.out.println("price " + order.cost());
        System.out.println("order " +order.getDescription());

        order = new Espresso();
        order = new Milk(order);//需要加入一个被包装的对象
        order = new Chocolate(order);
        System.out.println(order.cost());
        System.out.println(order.getDescription());


    }
}
