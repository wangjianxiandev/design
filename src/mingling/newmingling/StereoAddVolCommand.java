package mingling.newmingling;

import mingling.old.Stereo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-13
 * Time: 13:39
 */
public class StereoAddVolCommand implements Command {
    private Stereo stereo;
    public StereoAddVolCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        int vol = stereo.GetVol();
        if(vol<11){
            stereo.SetVol(++vol);
        }
    }

    @Override
    public void undo() {

    }
}
