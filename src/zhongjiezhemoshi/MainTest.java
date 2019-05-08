package zhongjiezhemoshi;

import zhuangshizhe.putongzhaungshi.Component.Coffee;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-08
 * Time: 20:59
 */
public class MainTest {
    public static void main(String[] args) {
        Mediator mediator = new ConcreateMediator();
        Alarm alarm = new Alarm(mediator, "Alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "mCoffeeMachine");
        TV tv = new TV(mediator, "mTV");
        Curtains curtains = new Curtains(mediator, "mCurtains");
        alarm.SendAlarm(0);
        coffeeMachine.FinishCoffee();
        alarm.SendAlarm(1);

    }
}
