package qiaojiemoshi.qiaojiemoshishili;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-02
 * Time: 20:27
 */
public interface Control {
    public void on();
    public void off();
    public void setChannel(int channel);
    public void setVolumn(int volumn);
}
