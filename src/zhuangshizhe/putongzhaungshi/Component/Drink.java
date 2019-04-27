package zhuangshizhe.putongzhaungshi.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-15
 * Time: 18:22
 */
public abstract class Drink {
    public String getDescription() {
        return description+"-"+this.getPrice();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String description = "";
    private float price = 0f;
    public abstract float cost();

}
