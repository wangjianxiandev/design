package gongchangmoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-16
 * Time: 12:25
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(name+"preparing");
    }
}
