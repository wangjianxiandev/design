package diedai.olddiedai;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 15:37
 */
public class MenuItem {

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
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetable() {
        return vegetable;
    }

    public float getPrice() {
        return price;
    }
}
