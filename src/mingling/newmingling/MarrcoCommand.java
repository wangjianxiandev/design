package mingling.newmingling;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-13
 * Time: 14:33
 */
public class MarrcoCommand implements Command {
    private Command[] commands;
    public MarrcoCommand(Command[] commands){
        this.commands = commands;
    }
    @Override
    public void execute() {
        for(int i = 0;i<commands.length;i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i = 0;i<commands.length;i++){
            commands[i].undo();
        }
    }
}
