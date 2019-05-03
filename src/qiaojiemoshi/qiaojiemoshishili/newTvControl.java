package qiaojiemoshi.qiaojiemoshishili;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-03
 * Time: 12:46
 */
public class newTvControl extends TvControlLabs {
    private int ch = 0;
    private boolean ison = false;
    private int prech = 0;
    public newTvControl(Control control){
        super(control);
    }
    @Override
    public void Onoff() {
        if(ison){
            ison = false;
            control.off();
        }else {
            ison = true;
            control.on();
        }
    }

    @Override
    public void nextChannel() {
        prech = ch;
        ch++;
        control.setChannel(ch);
    }


    @Override
    public void preChannel() {
        prech = ch;
        ch--;
        if(ch<1){
            ch = 200;
        }
        control.setChannel(ch);
    }
    public void setChannel(int nch){
        prech = ch;
        ch = nch;
        control.setChannel(ch);
    }

    public void back(){
        control.setChannel(prech);
    }
}
