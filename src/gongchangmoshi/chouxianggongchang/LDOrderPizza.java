package gongchangmoshi.chouxianggongchang;

import gongchangmoshi.GreekPizza;
import gongchangmoshi.Pizza;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-17
 * Time: 19:46
 */
public class LDOrderPizza implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("gw")){
            System.out.println("制造纽约风味的pizza");
            pizza = new GreekPizza();
        }

        return pizza;
    }
}
