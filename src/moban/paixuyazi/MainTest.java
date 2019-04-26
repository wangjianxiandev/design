package moban.paixuyazi;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-22
 * Time: 20:36
 */
public class MainTest {
    public static void main(String[] args) {
        Duck[] ducks = {new Duck("d1", 3),
        new Duck("d2", 2)};
        System.out.println("before sort");
        display(ducks);
        Arrays.sort(ducks);//静态的sort（模板），模板中的将抽象方法挪到每一个ducks对象上，模板中的compare本来是通过继承方法通过指针调用，所方程一个接口让数组对象实现这个接口然后调用对象的compareTo
        System.out.println("after sort");
        display(ducks);
    }
    public static void display(Duck[] ducks){
        for(int i = 0;i<ducks.length;i++){
            System.out.println(ducks[i].toString());
        }
    }
}