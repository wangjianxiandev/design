package mingling.newmingling;

import mingling.old.Light;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-18
 * Time: 11:06
 */
public class LightOnCommand implements Command {
    private Light light;
    //确定打开哪个灯
    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
    @Override
    public void undo() {
        light.off();
    }
}
