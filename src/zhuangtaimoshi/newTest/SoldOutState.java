package zhuangtaimoshi.newTest;

import zhuangtaimoshi.newTest.State;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-29
 * Time: 18:49
 */
public class SoldOutState implements State {
    private CandyMachine candyMachine;
    public SoldOutState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }
    @Override
    public void insetCoin() {
        System.out.println("Out of candies");
    }

    @Override
    public void returnCoin() {
        System.out.println("Out of candies");
    }

    @Override
    public void turnCrank() {
        System.out.println("Out of candies");
    }

    @Override
    public void dispense() {
        System.out.println("Out of candies");
    }

    @Override
    public void printstate() {
        System.out.println("****SoldOutState*****");
    }
}
