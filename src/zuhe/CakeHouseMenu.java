package zuhe;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 20:37
 */
public class CakeHouseMenu extends MenuComponent{
    private ArrayList<MenuComponent> menuItems;
    public CakeHouseMenu(){
        menuItems = new ArrayList<MenuComponent>();

    }

    public Iterator getIterator(){
        return new ComposeIterator(menuItems.iterator());
    }

    @Override
    public void print() {
        System.out.println("This cake menu");
    }

    private void addItem(String name, String description, boolean vegetable, float price){
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        menuItems.add(menuItem);
    }
}
