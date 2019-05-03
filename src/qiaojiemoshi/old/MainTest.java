package qiaojiemoshi.old;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-02
 * Time: 20:10
 */
public class MainTest {
    public static void main(String[] args) {
        LGTvControl lgTvControl = new LGTvControl();
        SonyTvControl sonyTvControl = new SonyTvControl();

        lgTvControl.Onoff();
        lgTvControl.nextChannel();
        lgTvControl.nextChannel();
        lgTvControl.preChannnel();
        lgTvControl.Onoff();


        sonyTvControl.Onoff();
        sonyTvControl.preChannnel();
        sonyTvControl.preChannnel();
        sonyTvControl.nextChannel();
        sonyTvControl.Onoff();

    }
}
