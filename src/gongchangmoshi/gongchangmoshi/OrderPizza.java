package gongchangmoshi.gongchangmoshi;

import gongchangmoshi.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-17
 * Time: 19:26
 */
public abstract class OrderPizza {
    public OrderPizza(){
        Pizza pizza = null;
        String ordertype;
        do{
            ordertype = getType();
            pizza = createPizza(ordertype);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);

    }
    abstract Pizza createPizza(String orderType);
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(
                    System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();

            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
