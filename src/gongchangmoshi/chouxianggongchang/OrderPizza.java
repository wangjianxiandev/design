package gongchangmoshi.chouxianggongchang;

import com.sun.org.apache.xpath.internal.operations.Or;
import gongchangmoshi.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-17
 * Time: 19:44
 */
public class OrderPizza {
    AbsFactory absFactory;
    public OrderPizza(AbsFactory absFactory){

    }
    public void setFactory(AbsFactory absFactory){
        Pizza pizza = null;
        String orderType;
        this.absFactory = absFactory;
        do{
            orderType = getType();
            pizza = absFactory.createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }while (true);
    }
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
