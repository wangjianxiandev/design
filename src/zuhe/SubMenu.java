package zuhe;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 20:02
 */
public class SubMenu extends MenuComponent {
    private ArrayList<MenuComponent> menuItems;
    public SubMenu(){
        menuItems = new ArrayList<>();
        addItem("w", "w", true, 1.0f);
        addItem("g", "g", true, 2.0f);
    }
    private void addItem(String name, String description, boolean vegetable, float price){
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        menuItems.add(menuItem);
    }
    public Iterator getIterator(){
        return new ComposeIterator(menuItems.iterator());
    }

    @Override
    public void print() {
        System.out.println("This is a subMenu");
    }
}
