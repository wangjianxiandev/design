package zerenlianmoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-05
 * Time: 20:17
 */
public class VicePresidentApprover extends Approver{
    public VicePresidentApprover(String Name){
        super(Name + " Vice Approver");
    }
    @Override
    public void ProcessRequest(PurchaseRequest request) {
        if((request.getSum()>=10000)&&(request.getSum()<=50000)){
            System.out.println("This request "+ request.getId() + " will be handled by "+ this.Name);
        }else{
            successor.ProcessRequest(request);
        }
    }
}
