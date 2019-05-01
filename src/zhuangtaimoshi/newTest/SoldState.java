package zhuangtaimoshi.newTest;

import zhuangtaimoshi.newTest.State;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-29
 * Time: 18:49
 */
public class SoldState implements State {
    private CandyMachine candyMachine;
    public SoldState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }
    @Override
    public void insetCoin() {
        System.out.println("please we are giving you a candy");
    }

    @Override
    public void returnCoin(){
        System.out.println("please we are giving you a candy");
    }

    @Override
    public void turnCrank() {
        System.out.println("please we are giving you a candy");
    }

    @Override
    public void dispense() {
        candyMachine.releaseCandy();
        if(candyMachine.getCount()>0){
            candyMachine.setState(candyMachine.onReadyState);
        }else{
            candyMachine.setState(candyMachine.soldOutState);
        }
    }

    @Override
    public void printstate() {
        System.out.println("*****SoldState*****");
    }
}
