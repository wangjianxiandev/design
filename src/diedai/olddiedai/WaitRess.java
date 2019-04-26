package diedai.olddiedai;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 15:51
 */
public class WaitRess {
    private CakeHouseMenu cakeHouseMenu;
    private DinerMenu dinerMenu;
    private ArrayList<MenuItem> cakeItems;
    private MenuItem[] dinerItems;
    public WaitRess(){
        cakeHouseMenu = new CakeHouseMenu();
        dinerMenu = new DinerMenu();
        cakeItems = cakeHouseMenu.getMenuItems();//将两个数据结构获取
        dinerItems = dinerMenu.getMenuItems();
    }
    public void printMenu(){
        MenuItem menuItem;
        for(int i = 0;i<cakeItems.size();i++){
            menuItem =  cakeItems.get(i);
            System.out.println(menuItem.getName() + "***" +menuItem.getPrice()+ "***" + menuItem.getDescription());
        }
        for(int i = 0;i<dinerMenu.numberOfItems;i++){
            menuItem = dinerItems[i];
            System.out.println(menuItem.getName() + "***" +menuItem.getPrice()+ "***" + menuItem.getDescription());
        }
    }
}
