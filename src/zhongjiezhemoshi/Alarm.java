package zhongjiezhemoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-08
 * Time: 20:41
 */
public class Alarm extends Colleague{
    public Alarm(Mediator mediator, String name){
        super(mediator, name);
        mediator.Register(name, this);
    }

    public void SendAlarm(int stateChange){
        SendMessage(stateChange);
    }
    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange, this.name);
    }
}
