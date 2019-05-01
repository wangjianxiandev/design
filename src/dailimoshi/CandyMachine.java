package dailimoshi;

import zhuangtaimoshi.newTest.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 14:02
 */
public class CandyMachine {
    State soldState;
    State onReadyState;
    State hasCoin;
    State soldOutState;
    State winnerState;

    public State getState() {
        return state;
    }

    private State state;

    public String getLocation() {
        return location;
    }

    private String location="";



    private int count = 0;

    public CandyMachine(String location, int count){
        this.location = location;
        this.count = count;
        soldOutState = new SoldOutState(this);
        onReadyState  = new OnReadyState(this);
        hasCoin = new HasCoin(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        if (count > 0) {
            state = onReadyState;
        }else{
            state = soldOutState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }
    //用户的动作，具体的行为通过状态对外的行为来表现
    public void insertCoin(){
        state.insetCoin();
    }
    public void returnCoin(){
        state.returnCoin();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    void releaseCandy(){
        if(count>0){
            count = count-1;
            System.out.println("A candy rolling out!");
        }
    }

    public int getCount() {
        return count;
    }
    public void printState(){
        state.printstate();
    }
}
