package diedai.newdiedai.impl;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 16:26
 */
public class MainTest {
    public static void main(String[] args) {
    WaitRess waitRess = new WaitRess();
        CakeHouseMenu cakeHouseMenu = new CakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        waitRess.addIterator(cakeHouseMenu.getIterator());
        waitRess.addIterator(dinerMenu.getIterator());
        waitRess.printMenu();

    }
}
