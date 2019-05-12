package fangwenzhemoshi.fangwenzhe;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-12
 * Time: 14:21
 */
public class Employees {
    private HashMap<String, Employee>  employees;
    public Employees(){
        employees = new HashMap<String , Employee>();
    }
    public void attach(Employee employee){
        employees.put(employee.getName(), employee);
    }
    public void detch(Employee employee){
        employees.remove(employee);
    }
    public Employee getEmpployee(String name){
        return employees.get(name);
    }

    //将visitor暴露给每一个Employee
    public void Accept(Visitor visitor){
        for(Employee employee:employees.values()){
            employee.Accept(visitor);
        }
    }

}
