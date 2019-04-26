package zuhe;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 19:56
 */

/**
 * 菜单为什么不需要迭代器，因为菜单项的东西是空的，不需要遍历其他
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetable;
    private float price;
    public MenuItem(String name, String description, boolean vegetable, float price){
       this.name = name;
       this.description = description;
       this.vegetable = vegetable;
       this.price = price;
    }
    @Override
    public String getName(){
        return name;
    }
    public String getDdescription(){
        return description;
    }
    public float getPrice(){
        return price;
    }
    public boolean isVegetable(){
        return vegetable;
    }

    @Override
    public void print() {
        System.out.println(getName()+"***" +getDdescription()+"***" + isVegetable() +"***" +getPrice());
    }

}
