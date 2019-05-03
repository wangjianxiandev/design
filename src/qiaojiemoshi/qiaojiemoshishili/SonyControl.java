package qiaojiemoshi.qiaojiemoshishili;



/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-02
 * Time: 20:00
 */
public class SonyControl implements Control {

    @Override
    public void on() {
        System.out.println("Sony is on");
    }

    @Override
    public void off() {
        System.out.println("Sony is off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sony channel is："+channel);
    }

    @Override
    public void setVolumn(int volumn) {
        System.out.println("Current sony Tv's volumn is:"+volumn);
    }
}
