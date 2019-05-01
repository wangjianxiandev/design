package dailimoshi.RMICandy;



import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 19:07
 */
public class CandyMachine extends UnicastRemoteObject implements CandymachineRemote {
    State soldState;
    State onReadyState;
    State hasCoin;
    State soldOutState;
    State winnerState;

    @Override
    public State getState() {
        return state;
    }

    private State state;


    @Override
    public String getLocation() {
        return location;
    }

    private String location="";



    private int count = 0;

    public CandyMachine(String location, int count) throws RemoteException {
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

    @Override
    public int getCount() {
        return count;
    }
    public void printState(){
        state.printstate();
    }
}
