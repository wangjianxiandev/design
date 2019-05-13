package mingling.newmingling;

import mingling.old.Light;
import mingling.old.Stereo;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-13
 * Time: 13:50
 */
public class MainTest {
    public static void main(String[] args) {
        CommandModeControl commandModeControl = new CommandModeControl();
        MarrcoCommand onMarr, offmarr;
        Light bedlight= new Light("Bed");
        Light light1 = new Light("kitch");
        Stereo stereo = new Stereo();
        LightOnCommand  bedLighton = new LightOnCommand(bedlight);
        LightOffCommand bedLightOff = new LightOffCommand(bedlight);
        LightOnCommand kitchLightOn = new LightOnCommand(light1);
        LightOffCommand kitchLightOff = new LightOffCommand(light1);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        SerenOffCommand serenOffCommand = new SerenOffCommand(stereo);
        StereoAddVolCommand stereoAddVolCommand = new StereoAddVolCommand(stereo);
        Command[] oncommands = {bedLighton, kitchLightOn};
        Command[] offcommands = {bedLightOff, kitchLightOff};
        onMarr = new MarrcoCommand(oncommands);
        offmarr = new MarrcoCommand(offcommands);


        commandModeControl.setCommand(0, bedLighton, bedLightOff);
        commandModeControl.setCommand(1, kitchLightOn, kitchLightOff);
        commandModeControl.setCommand(2,stereoOnCommand, serenOffCommand);
        commandModeControl.setCommand(3, onMarr, offmarr);

//        commandModeControl.setCommand(3);
        commandModeControl.onButton(0);
        commandModeControl.undo();
        commandModeControl.offButton(0);
        commandModeControl.onButton(1);
        commandModeControl.offButton(1);
        commandModeControl.onButton(2);
        commandModeControl.offButton(2);
        commandModeControl.onButton(3);
        commandModeControl.offButton(3);
    }
}
