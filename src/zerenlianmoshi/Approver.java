package zerenlianmoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-05
 * Time: 20:09
 */
/**
 * 抽象handler
 */
public abstract class Approver {
    //后续处理者的变量
    Approver successor;
    String Name;
    public Approver(String Name){
        //返回部长或者组长的名字
        this.Name = Name;
    }
    //·各个部门有不同的处理方法
    public abstract void ProcessRequest(PurchaseRequest request);
    //这个对象后继可以处理的对象
    public void SetSuccessor(Approver successor){
        this.successor = successor;
    }
}
