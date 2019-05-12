package fangwenzhemoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-12
 * Time: 13:45
 */
public class MainTest {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.attach(new Employee("Wjx", 19000, 8,1));
        employees.attach(new Employee("Jerry", 5000, 10, 2));
        employees.attach(new Employee("Jack", 9600, 12, 3));
        employees.getCompensation();

    }
}
