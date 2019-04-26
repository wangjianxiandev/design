package waiguan;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-20
 * Time: 19:44
 */
public class Popcorn {
    private Popcorn(){

    }
    private static Popcorn popcorn = null;
    public static Popcorn getInstance(){
        if(popcorn==null){
            popcorn = new Popcorn();
        }
        return popcorn;
    }
    public void on(){
        System.out.println("Popcorn is on");
    }
    public void off(){
        System.out.println("Popcorn is off");
    }
}
