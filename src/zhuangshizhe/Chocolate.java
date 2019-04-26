package zhuangshizhe;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-15
 * Time: 19:11
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink obj){
        super(obj);
        super.setDescription("Chocolate");
        super.setPrice(2.0f);
    }
}
