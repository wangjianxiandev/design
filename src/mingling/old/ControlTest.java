package mingling.old;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-13
 * Time: 13:09
 */
public class ControlTest {
    public static void main(String[] args) {
        Control control;
        Light light = new Light("xia");
        Stereo stereo = new Stereo();
        control = new TraditionControl(light, stereo);
        control.onButton(0);
        control.offButton(0);
        control.onButton(1);
        control.onButton(2);
        control.offButton(2);
        control.offButton(1);
    }
}
