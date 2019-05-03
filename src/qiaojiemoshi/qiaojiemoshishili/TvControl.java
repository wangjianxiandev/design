package qiaojiemoshi.qiaojiemoshishili;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-02
 * Time: 20:29
 */
public class TvControl extends TvControlLabs {
    private static  int ch = 0;
    private static boolean ison = false;

    public TvControl(Control control){
        super(control);
    }
    @Override
    public void Onoff() {
        if(ison){
            ison = false;
            control.off();
        }else{
            ison = true;
            control.on();
        }
    }

    @Override
    public void nextChannel() {

        ch++;
        control.setChannel(ch);
    }

    @Override
    public void preChannel() {
        ch--;
        if(ch<1){
            ch = 200;
        }
        control.setChannel(ch);
    }
}
