package gongchangmoshi.gongchangmoshi;

import gongchangmoshi.GreekPizza;
import gongchangmoshi.Pizza;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-17
 * Time: 19:32
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("gw")){
            pizza = new GreekPizza();
        }
        return pizza;
    }
}
