package zuhe;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 21:09
 */
public class MainTest {
    public static void main(String[] args) {
        WaitRess waitRess = new WaitRess();
        CakeHouseMenu cakeHouseMenu = new CakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        waitRess.addComponent(cakeHouseMenu);
        waitRess.addComponent(dinerMenu);
        waitRess.printMenu();
    }
}
