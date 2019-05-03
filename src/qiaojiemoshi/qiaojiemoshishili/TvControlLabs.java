package qiaojiemoshi.qiaojiemoshishili;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-02
 * Time: 20:41
 */
public abstract class TvControlLabs {
    Control control = null;
    public TvControlLabs(Control control){
        this.control = control;//桥接关键点传入接口
    }

    public abstract void Onoff();
    public abstract void nextChannel();
    public abstract  void preChannel();
}
