package dailimoshi;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 14:09
 */
public class Monitor {
    private ArrayList<CandyMachine> candyMachines;
    public Monitor(){
        candyMachines = new ArrayList<CandyMachine>();
    }

    public void addMachine(CandyMachine candyMachine){
        candyMachines.add(candyMachine);
    }

    public void report(){
        CandyMachine candyMachine;
        for(int i = 0;i<candyMachines.size();i++){
            candyMachine = candyMachines.get(i);
            System.out.println("Machine loc: " + candyMachine.getLocation());
            System.out.println("Machine candy count: "+ candyMachine.getCount());
            System.out.println("Machine State: "+candyMachine.getState().toString());
        }
    }
}
