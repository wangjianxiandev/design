package mingling.newmingling;

import mingling.old.Stereo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-13
 * Time: 13:53
 */
public class SerenOffCommand implements Command {
    private Stereo stereo;
    public SerenOffCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.Off();
    }

    @Override
    public void undo() {

    }
}
