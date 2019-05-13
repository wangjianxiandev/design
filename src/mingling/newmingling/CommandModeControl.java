package mingling.newmingling;


import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-13
 * Time: 13:41
 */
public class CommandModeControl implements Control {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> stack = new Stack<Command>();
    public CommandModeControl(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        Command noCommand = new NoCommand();
        //初始化赋值noCommand，有可能不是每个按钮都有工作，若果不做这一步在执行的时候就需要判断是否这个插槽下面有对象
        for(int i=0;i<5;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
    //把命令对象设置到遥控器上，舍得命令作为参数，把具体设备的功能作为参数传递过来,绑定可以运行时改动，遥控器并不需要知道什么设备实现解耦
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    @Override
    public void onButton(int slot) {
        onCommands[slot].execute();
        stack.push(onCommands[slot]);
    }

    @Override
    public void offButton(int slot) {
        offCommands[slot].execute();
        stack.push(offCommands[slot]);
    }

    @Override
    public void undo() {
        stack.pop().undo();
    }
}
