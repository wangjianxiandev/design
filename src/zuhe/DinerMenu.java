package zuhe;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 20:06
 */
public class DinerMenu extends MenuComponent {
    private final static int MAX_ITEM = 5;
    private int numberOfItems = 0;
    private MenuComponent[] menuItems;

    public DinerMenu(){
        menuItems = new MenuComponent[MAX_ITEM];//为迭代器一致性处理提供了方便
        addItem("wj",  "wj", true,  3.0f);
        addSubMenu(new SubMenu());

    }
    private void addSubMenu(MenuComponent mMenuComponent){
        if(numberOfItems>=  MAX_ITEM){
            System.out.println("Sorry isFull");
        }else{
            menuItems[numberOfItems] = mMenuComponent;
            numberOfItems++;
        }
    }
    private void addItem(String name, String description, boolean vegetable,  float price){
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        if(numberOfItems >= MAX_ITEM){
            System.out.println("Sorry is full");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    @Override
    public void print() {
        System.out.println("This is DinerMenu");
    }
    public Iterator getIterator(){
    return new ComposeIterator(new DinerMenuIterator());
    }
    class DinerMenuIterator implements Iterator{
        private int position = 0;
        public DinerMenuIterator(){
            position = 0;
        }

        @Override
        public boolean hasNext() {
            if(position<MAX_ITEM){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            MenuComponent menuItem = menuItems[position];
            position++;
            return menuItem;
        }
    }
}
