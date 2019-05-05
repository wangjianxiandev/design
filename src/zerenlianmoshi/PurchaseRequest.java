package zerenlianmoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-05
 * Time: 20:06
 */
public class PurchaseRequest {


    private int Type = 0;
    private int Number = 0;
    private float Price = 0;
    //请求的ID号
    private int ID = 0;


    public PurchaseRequest(int Type, int Number, float Price){
        this.Type = Type;
        this.Number = Number;
        this.Price = Price;
    }

    public int getType() {
        return Type;
    }

    public float getSum(){
        return Number * Price;
    }

    public int getId(){
        return (int)(Math.random()*1000);
    }
}
