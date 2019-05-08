package zhongjiezhemoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-08
 * Time: 20:43
 */
public class Curtains extends Colleague {
    public Curtains(Mediator mediator, String name){
        super(mediator, name);
        mediator.Register(name, this);
    }

    public void UpCurtains(){
        System.out.println("I am holding up Curtains");
    }


    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange, this.name);
    }
}
