package mingling.old;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-18
 * Time: 11:07
 */
public class Light {
    String loc = "";
    public Light(String loc){
        this.loc = loc;
    }
    public void on(){
        System.out.println(loc + "on");
    }
    public void off(){
        System.out.println(loc + "off");
    }
}
