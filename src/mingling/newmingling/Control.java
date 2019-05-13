package mingling.newmingling;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-13
 * Time: 14:06
 */
public interface Control {
    public void onButton(int slot);
    public void offButton(int slot);
    public void undo();
}