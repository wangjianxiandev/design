package moban.mobantest;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-22
 * Time: 19:31
 */
public class Tea1 extends HotDrinkTemplete {

    //个性化的部分子类自己实现
    @Override
    public void brew() {
        System.out.println("Brewing Tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
    @Override
    public boolean wantCondimentsHook(){
        Scanner input = new Scanner(System.in);
        String x = input.next();
        if(x.equals("y")){
            return true;
        }else{
            return false;
        }
    }
}
