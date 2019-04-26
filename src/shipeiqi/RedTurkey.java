package shipeiqi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-18
 * Time: 14:34
 */
public class RedTurkey implements Turkey {
    @Override
    public void gogo() {
        System.out.println("Go Go");
    }

    @Override
    public void fly() {
        System.out.println("Fly  a short distance");
    }
}
