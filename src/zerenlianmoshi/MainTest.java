package zerenlianmoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-05
 * Time: 20:23
 */
public class MainTest {
    public static void main(String[] args) {
        Client client = new Client();
        Approver GroupLeader = new GroupApprover("GTom");
        Approver DepartmentLeader = new DepartMentApprover("DJerry");
        Approver VicePresident = new VicePresidentApprover("VKate");
        Approver President = new PisesidentApprover("Pwjx");

        //设置责任链
        GroupLeader.SetSuccessor(DepartmentLeader);
        DepartmentLeader.SetSuccessor(VicePresident);
        VicePresident.SetSuccessor(President);

        President.SetSuccessor(GroupLeader);

        GroupLeader.ProcessRequest(client.sendRequest(1, 100, 40));
        GroupLeader.ProcessRequest(client.sendRequest(2,200,40));
        GroupLeader.ProcessRequest(client.sendRequest(3,300,40));
        GroupLeader.ProcessRequest(client.sendRequest(4,400,140));

//设置成环的用处，后继会从头开始，只要成环，结果相同
        //但是如果某些文件会经过多手审阅，这时候就要是按照顺序设置链
        VicePresident.ProcessRequest(client.sendRequest(1, 100, 40));
        VicePresident.ProcessRequest(client.sendRequest(2,200,40));
        VicePresident.ProcessRequest(client.sendRequest(3,300,40));
        VicePresident.ProcessRequest(client.sendRequest(4,400,140));



    }
}
