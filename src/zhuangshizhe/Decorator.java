package zhuangshizhe;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-15
 * Time: 18:30
 */
public class Decorator extends Drink {
    public Drink obj;//需要被包装的主题
    public Decorator(Drink obj){
        this.obj = obj;
    }
    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }
    public String getDescription(){
        return super.getDescription()+"&&"+obj.getDescription();
    }
}
