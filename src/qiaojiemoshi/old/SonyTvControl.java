package qiaojiemoshi.old;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-02
 * Time: 20:06
 */
public class SonyTvControl extends SonyControl implements TvControl {
    private  static int ch = 0;
    private static boolean ison = false;
    @Override
    public void Onoff() {
        if(ison){
            ison = false;
            super.off();
        }else{
            ison = true;
            super.on();
        }

    }

    @Override
    public void nextChannel() {
        ch++;
        super.setChannel(ch);
    }

    @Override
    public void preChannnel() {
        ch--;
        if(ch<0){
            ch = 200;
        }
        super.setChannel(ch);
    }
}
