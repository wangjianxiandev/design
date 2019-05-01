package dailimoshi.RMICandy;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 19:16
 */
public class Monitor {
    private ArrayList<CandymachineRemote> candyMachines;
    public Monitor(){
        candyMachines = new ArrayList<CandymachineRemote>();
    }

    public void addMachine(CandymachineRemote candymachineRemote){
        candyMachines.add(candymachineRemote);
    }

    public void report(){
        CandymachineRemote candymachineRemote;
        for(int i = 0;i<candyMachines.size();i++){
            candymachineRemote= candyMachines.get(i);
            try {

                System.out.println("Machine loc: " + candymachineRemote.getLocation());
                System.out.println("Machine candy count: " + candymachineRemote.getCount());
                System.out.println("Machine State: " + candymachineRemote.getState().toString());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
