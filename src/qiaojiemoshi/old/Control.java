package qiaojiemoshi.old;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-02
 * Time: 19:57
 */
public interface Control {
    public void on();
    public void off();
    public void setChannel(int channel);
    public void setVolumn(int volumn);
}
