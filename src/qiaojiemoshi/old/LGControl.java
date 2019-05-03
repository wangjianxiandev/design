package qiaojiemoshi.old;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-02
 * Time: 20:02
 */
public class LGControl implements Control {
    @Override
    public void on() {
        System.out.println("LG is on");
    }

    @Override
    public void off() {
        System.out.println("LG is off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("LG channel is："+channel);
    }

    @Override
    public void setVolumn(int volumn) {
        System.out.println("Current LG Tv's volumn is:"+volumn);
    }
}
