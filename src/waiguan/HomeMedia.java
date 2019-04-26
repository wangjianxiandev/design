package waiguan;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-20
 * Time: 19:48
 */
public class HomeMedia {
    private DVD dvd;
    private Popcorn popcorn;
    public HomeMedia(){
        dvd = DVD.getInstance();
        popcorn = Popcorn.getInstance();
    }
    public void on(){
        dvd.on();
        popcorn.on();
    }
    public void off(){
        dvd.off();
        popcorn.off();
    }

}
