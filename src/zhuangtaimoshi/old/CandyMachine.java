package zhuangtaimoshi.old;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-28
 * Time: 21:13
 */
public class CandyMachine {
    //状态图中的四个状态
    final static  int SoldOutState = 0;
    final static int OnReadyState = 1;
    final static int HasCoin = 2;
    final static int SoldState = 3;

    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    //当前机器状态
    private int state = SoldOutState;
    private int count = 0;

    //初始化糖果机
    public CandyMachine(int count){
        this.count = count;
        if(count>0){
            state = OnReadyState;
        }
    }

    //插入硬币
    public void insertCoin(){
        switch (state){
            case SoldOutState:
                System.out.println("Sold out");
                break;
            case OnReadyState:
                System.out.println("get it out");
                state = HasCoin;
                break;
            case HasCoin:
                System.out.println("you can not insert another coin");
                break;
            case SoldState:
                System.out.println("Please wait for a candy");
                break;

        }
    }
    public void returnCoin(){
        switch (state){
            case SoldOutState:
                System.out.println("you have not iinserted a coin");
                break;
            case OnReadyState:
                System.out.println("you have not iinserted a coin");
                break;
            case HasCoin:
                System.out.println("Coin return");
                setState(OnReadyState);
                break;
            case SoldState:
                System.out.println("Sorry we are giving you candy you cannot return");
                break;
        }
    }

    public void turnCrank(){
        switch (state){
            case SoldOutState:
                System.out.println("No coin left");
                break;
            case OnReadyState:
                System.out.println("you have not inserted a coin");
                break;
            case HasCoin:
                System.out.println("turn");
                setState(SoldState);
                disPense();
                break;
            case SoldState:
                System.out.println("you can only get one candy");
                break;
        }
    }

    public void disPense(){
        count = count -1;
        System.out.println("a candy rolling out!");
        if(count>0){
            state = OnReadyState;
        }else{
            System.out.println("No candies left");
            state = SoldOutState;
        }


    }
    public void printState(){
        switch (state){
            case SoldOutState:
                System.out.println("*****SoldOutState*****");
                break;
            case OnReadyState:
                System.out.println("*****OnReadyState*****");
                break;
            case HasCoin:
                System.out.println("*****HasCoin*****");
                break;
            case SoldState:
                System.out.println("*****SoldState*****");
                break;
        }
    }
}
