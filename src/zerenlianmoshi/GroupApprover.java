package zerenlianmoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-05
 * Time: 20:12
 */
public class GroupApprover extends Approver {

    public GroupApprover(String Name){
        super(Name + " GroupApprover");
    }
    @Override
    public void ProcessRequest(PurchaseRequest request) {
        if(request.getSum() < 5000){
            System.out.println("This request "+ request.getId() + " will be handled by "+ this.Name);

        }else{
            //处理不了不用管是谁直接丢给下一个
            successor.ProcessRequest(request);
        }

    }
}
