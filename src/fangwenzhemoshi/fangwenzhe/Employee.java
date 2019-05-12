package fangwenzhemoshi.fangwenzhe;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-12
 * Time: 14:15
 */
public class Employee extends Element {
    private String name;
    private float income;
    private int vacationDays;
    private int degree;
    public Employee(String name, float income, int vacationDays,int degree){
        this.name = name;
        this.income = income;
        this.vacationDays = vacationDays;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    //接上访问者之后访问者注入到雇员，把雇员对象给访问者用，第一个将访问者指派给雇员，雇员把自己反馈给访问者双重指派, 将自己暴露给visitor
    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
