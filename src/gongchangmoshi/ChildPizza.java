package gongchangmoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-17
 * Time: 19:16
 */
public class ChildPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(name + "preparing");
    }
}
