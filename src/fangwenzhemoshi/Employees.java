package fangwenzhemoshi;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-12
 * Time: 13:36
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

    public void getCompensation(){
        for(Employee employee:employees.values()){
            System.out.println(employee.getName()+"'s compensation is "+ (employee.getDegree() * employee.getVacationDays() * 100));
        }
    }
}
