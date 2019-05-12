package fangwenzhemoshi.fangwenzhe;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-12
 * Time: 14:20
 */
public class CompensationVisitor  implements Visitor {

    @Override
    public void Visit(Element element) {
        Employee employee = (Employee) element;
        System.out.println(employee.getName()+"'s compensation is "+ (employee.getDegree() * employee.getVacationDays() * 100));
    }
}
