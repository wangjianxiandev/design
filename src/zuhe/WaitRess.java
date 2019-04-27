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
    private ArrayList<MenuComponent> menuItems = new ArrayList<MenuComponent>();
    public WaitRess(){

    }
    public void addComponent(MenuComponent menuComponent){
        menuItems.add(menuComponent);
    }
    public void printMenu(){
        Iterator iterator;
        MenuComponent menuComponent;
        for(int i = 0;i<menuItems.size();i++){
            menuItems.get(i).print();//打印菜单类型
            iterator = menuItems.get(i).getIterator();//得到某一个菜单项
            while(iterator.hasNext()){//遍历菜单项
               menuComponent = (MenuComponent) iterator.next();
               menuComponent.print();
            }
        }
    }
    public void printVegetableMenu(){//打印素食
        Iterator iterator;
        MenuComponent menuComponent;
        for(int i = 0;i<menuItems.size();i++){
            menuItems.get(i).print();
            iterator = menuItems.get(i).getIterator();
            while(iterator.hasNext()){
                menuComponent = (MenuComponent)iterator.next();
                if(menuComponent.isVegetable()){
                    menuComponent.print();
                }
            }
        }
    }

}
