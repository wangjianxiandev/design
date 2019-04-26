package shipeiqi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-18
 * Time: 14:38
 */
public class MainTest {
    public static void main(String[] args) {
        RedDuck redDuck = new RedDuck();
        RedTurkey redTurkey = new RedTurkey();
        Duck duckTurkey = new TurkeyAdapter(redTurkey);
        duckTurkey.gaga();
        duckTurkey.fly();
        TurkeyAdapter2 turkeyAdapter2 = new TurkeyAdapter2();
        turkeyAdapter2.gaga();
        turkeyAdapter2.fly();
    }
}
