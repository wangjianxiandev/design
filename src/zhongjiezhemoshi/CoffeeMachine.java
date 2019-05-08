package zhongjiezhemoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-08
 * Time: 20:45
 */
public class CoffeeMachine extends Colleague {
    public CoffeeMachine(Mediator mediator, String name){
        super(mediator, name);
        mediator.Register(name, this);
    }

    public void StartCoffee(){
        System.out.println("It is time to coffee");
    }

    public void FinishCoffee(){
        System.out.println("After 5m  coffee is ok");
        SendMessage(0);
    }
    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange, this.name);
    }
}
