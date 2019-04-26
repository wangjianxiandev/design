package waiguan;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-20
 * Time: 19:44
 */
public class DVD {
    private static DVD dvd = null;
    private DVD(){

    }
    public static DVD getInstance(){
        if(dvd == null){
            dvd = new DVD();
        }
        return dvd;
    }
    public void on(){
        System.out.println("Dvd is on");
    }
    public void off(){
        System.out.println("Dvd is off");
    }
}
