package mingling.newmingling;

import mingling.old.Stereo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-13
 * Time: 13:32
 */
public class StereoOnCommand implements Command {
    private Stereo stereo;
    public StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.On();
        stereo.SetCd();
    }

    @Override
    public void undo() {
//
    }
}
