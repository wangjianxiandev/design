package mingling.newmingling;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-18
 * Time: 11:05
 */
public interface Command {
    //所有命令对象的超类
    public void execute();
    public void undo();
}
