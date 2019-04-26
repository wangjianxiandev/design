package gongchangmoshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-16
 * Time: 12:31
 */
public class OrderPizza {
    SimplePizzaFactory simplePizzaFactory;
    public OrderPizza(SimplePizzaFactory  simplePizzaFactory){
        setSimplePizzaFactory(simplePizzaFactory);
    }
    public void setSimplePizzaFactory(SimplePizzaFactory simplePizzaFactory){
        Pizza pizza = null;
        String orderType;
        this.simplePizzaFactory =  simplePizzaFactory;

        do{
            orderType = gettype();
            pizza = simplePizzaFactory.createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }

        }while(true);
    }
    private String gettype() {
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
