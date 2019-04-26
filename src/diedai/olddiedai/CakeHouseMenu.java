package diedai.olddiedai;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 15:43
 */
public class CakeHouseMenu {


    private ArrayList<MenuItem> menuItems;
    public CakeHouseMenu(){
        menuItems = new ArrayList<>();
        addItem("KFC", "boiled", true, 3.39f);
        addItem("KM", "boiled water", true, 3.39f);
    }
    private void addItem(String name, String description, boolean vegetable, float price){
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        menuItems.add(menuItem);
    }
    //注意将菜单项暴露给别人，外部可以任意操作自己的信息，外部和内部的耦合度比较高，不安全
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
