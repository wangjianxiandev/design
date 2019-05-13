package mingling.old;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-13
 * Time: 12:44
 */
public class TraditionControl implements Control{
    private Light light;
    private Stereo stereo;
    public TraditionControl(Light light, Stereo stereo){
        this.light = light;
        this.stereo = stereo;
    }
    @Override
    public void onButton(int slot) {
        switch (slot){
            case 0:
                light.on();
                break;
            case 1:
                stereo.On();
                break;
            case 2:
                int vol = stereo.GetVol();
                if(vol<11){
                    stereo.SetVol(++vol);
                }
                break;
        }

    }

    @Override
    public void offButton(int slot) {
        switch (slot){
            case 0:
                light.off();
                break;
            case 1:
                stereo.Off();
                break;
            case 2:
                int vol = stereo.GetVol();
                if(vol>0){
                    stereo.SetVol(--vol);
                }
                break;
        }
    }
}
