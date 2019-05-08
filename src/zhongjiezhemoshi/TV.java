package zhongjiezhemoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-08
 * Time: 20:42
 */
public class TV extends Colleague{
    public TV(Mediator mediator, String name){
        super(mediator, name);
        mediator.Register(name, this);
    }
    public void StartTV(){
        System.out.println("Tv is on");
    }
    public void StopTV(){
        System.out.println("TV is off");
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange, this.name);
    }
}
