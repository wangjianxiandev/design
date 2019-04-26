package zuhe;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 21:05
 */
public class WaitRess {
    private ArrayList<MenuComponent> iterators = new ArrayList<>();
    public WaitRess(){

    }
    public void addComponent(MenuComponent menuComponent){
        iterators.add(menuComponent);
    }
    public void printMenu(){
        Iterator iterator;
        MenuComponent menuComponent;
        for(int i = 0;i<iterators.size();i++){
            iterators.get(i).print();
            iterator = iterators.get(i).getIterator();
            while(iterator.hasNext()){
               menuComponent = (MenuComponent) iterator.next();
               menuComponent.print();
            }
        }
    }

}
