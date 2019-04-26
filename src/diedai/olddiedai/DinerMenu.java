package diedai.olddiedai;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 15:48
 */
public class DinerMenu {
    private final static int MAX_ITEM = 5;
    public int numberOfItems = 0;//设置数组中指向当前元素的指针

    private MenuItem[] menuItems;
    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEM];
        addItem("KFC1", "boiled1", true, 3.34f);
        addItem("KM1", "boiled water1", true, 3.34f);
    }
    private void addItem(String name, String description, boolean vegetable, float price){
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        if(numberOfItems>=MAX_ITEM){
            System.out.println("Sorry, isfull");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
