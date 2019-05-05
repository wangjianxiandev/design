package zerenlianmoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-05
 * Time: 20:20
 */
public class PisesidentApprover extends Approver {
    public PisesidentApprover(String Name){
        super(Name + " Piesident");
    }
    @Override
    public void ProcessRequest(PurchaseRequest request) {
        if(request.getSum()>=50000){
            System.out.println("This request "+ request.getId() + " will be handled by "+ this.Name);
        }else{
            //因为责任链无序，所以可能第一个就是老总所以还是要抛给下一个
            successor.ProcessRequest(request);
        }
    }
}
