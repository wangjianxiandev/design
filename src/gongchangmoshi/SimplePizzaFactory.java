package gongchangmoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-16
 * Time: 12:28
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("gw")) {
            pizza = new GreekPizza();
        }else if(orderType.equals("child")){
            pizza = new ChildPizza();
        }
        return pizza;
    }
}
