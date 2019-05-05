package zerenlianmoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-05
 * Time: 20:21
 */
public class Client {
    public Client(){

    }

    public PurchaseRequest sendRequest(int Type, int Number, float Price){
        //只发送请求完全解耦
        return new PurchaseRequest(Type, Number, Price);
    }
}
