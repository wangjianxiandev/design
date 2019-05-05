package zerenlianmoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-05
 * Time: 20:15
 */
public class DepartMentApprover extends Approver {
    public DepartMentApprover(String Name){
        super(Name + " DepartMentApprover");
    }
    @Override
    public void ProcessRequest(PurchaseRequest request) {
        //一定要写上下范围，否则就会有耦合
        if((request.getSum()>=5000)&&(request.getSum()<=10000)){
            System.out.println("This request "+ request.getId() + " will be handled by "+ this.Name);
        }else{
            successor.ProcessRequest(request);
        }
    }
}
