package zhongjiezhemoshi;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-08
 * Time: 20:38
 */
public class ConcreateMediator implements Mediator {
    //让所有同事对象放入,让中介者直到有多少个对象
    private HashMap<String, Colleague> colleagueMap;
    //知道谁发送消息,而且因为可能会通知两个以上的对象，使用内部映射
    private HashMap<String, String>  interMap;

    public ConcreateMediator(){
        colleagueMap = new HashMap<String, Colleague>();
        interMap = new HashMap<String, String>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
        if(colleague instanceof  Alarm){
            //名字对应
            interMap.put("Alarm", colleagueName);
        }else if(colleague instanceof CoffeeMachine){
            interMap.put("CoffeeMachine", colleagueName);
        } else if(colleague instanceof TV){
            interMap.put("TV", colleagueName);
        }else if(colleague instanceof Curtains){
            interMap.put("Curtains", colleagueName);
        }

    }

    @Override
    public void GetMessage(int stateChange, String colleagueName) {
        if(colleagueMap.get(colleagueName) instanceof Alarm){
            if(stateChange == 0){
                //通过interMap获取对象名字，再通过colleagueMap获取对象
                ((CoffeeMachine)(colleagueMap.get(interMap.get("CoffeeMachine")))).StartCoffee();
                ((TV)(colleagueMap.get(interMap.get("TV")))).StartTV();
            }else if(stateChange == 1){
                ((TV) (colleagueMap.get(interMap.get("TV")))).StopTV();
            }
        }else if(colleagueMap.get(colleagueName) instanceof CoffeeMachine){
            ((Curtains)(colleagueMap.get(interMap.get("Curtains")))).UpCurtains();
        }else if(colleagueMap.get(colleagueName) instanceof  TV){

        }else if(colleagueMap.get(colleagueName) instanceof  Curtains){

        }

    }
    //不需要 发送信息，直接在获取信息的同时进行处理
    @Override
    public void SendMessage() {

    }
}
