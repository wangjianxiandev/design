package qiaojiemoshi.qiaojiemoshishili;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-02
 * Time: 20:32
 */
public class Maintest {
    public static void main(String[] args) {
        TvControl tvControlLG;
        TvControl tvControlSony;
        newTvControl newtvControl;
        newtvControl = new newTvControl(new SonyControl());
        newtvControl.Onoff();;
        newtvControl.nextChannel();
        newtvControl.setChannel(9);
        newtvControl.setChannel(28);
        newtvControl.back();
        newtvControl.Onoff();
//        tvControlLG = new TvControl(new LGControl());
//        tvControlSony = new TvControl(new SonyControl());



//        tvControlLG.Onoff();
//        tvControlLG.nextChannel();
//        tvControlLG.nextChannel();
//        tvControlLG.preChannel();
//        tvControlLG.Onoff();
//
//
//        tvControlSony.Onoff();
//        tvControlSony.preChannel();
//        tvControlSony.preChannel();
//        tvControlSony.nextChannel();
//        tvControlSony.Onoff();
    }
}
