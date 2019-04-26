package diedai.newdiedai.impl;

import java.util.Iterator;
import diedai.olddiedai.CakeHouseMenu;
import diedai.olddiedai.DinerMenu;
import diedai.olddiedai.MenuItem;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 15:51
 */
public class WaitRess {
    private ArrayList<Iterator> iterators = new ArrayList<Iterator>();
    private CakeHouseMenu cakeHouseMenu;
    private DinerMenu dinerMenu;
    private ArrayList<MenuItem> cakeItems;
    private MenuItem[] dinerItems;
    public WaitRess() {
    }
    public void addIterator(Iterator iterator){
        iterators.add(iterator);
    }

    public void printMenu() {
        Iterator iterator;
        MenuItem menuItem;
        for(int i = 0;i<iterators.size();i++){
            iterator = iterators.get(i);
            while(iterator.hasNext()){
                menuItem = (MenuItem) iterator.next();
                System.out.println(menuItem.getName() + "***" +menuItem.getPrice()+ "***" + menuItem.getDescription());

            }
        }
    }
}
