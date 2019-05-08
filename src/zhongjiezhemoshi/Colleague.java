package zhongjiezhemoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-08
 * Time: 20:38
 */
public abstract class Colleague {
    //将中介者注册到同事中
    private Mediator mediator;
    public String name;
    public Colleague(Mediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void SendMessage(int stateChange);
}
