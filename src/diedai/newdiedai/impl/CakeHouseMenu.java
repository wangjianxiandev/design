package diedai.newdiedai.impl;

import java.util.Iterator;
import diedai.olddiedai.MenuItem;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 16:13
 */
public class CakeHouseMenu {
    private ArrayList<MenuItem> menuItems;
    public CakeHouseMenu(){
        menuItems = new ArrayList<>();
        addItem("KFCnew", "boiled", true, 3.39f);
        addItem("KMnew", "boiled water", true, 3.39f);
    }
    private void addItem(String name, String description, boolean vegetable, float price){
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        menuItems.add(menuItem);
    }


    public Iterator getIterator(){
        return new CakeHouseIterator();
    }
    class CakeHouseIterator implements Iterator{
        private int position = 0;//判断是否到最后
        public CakeHouseIterator(){
            position = 0;
        }
        @Override
        public boolean hasNext() {
            if(position<menuItems.size()){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            MenuItem menuItem = menuItems.get(position);
            position++;
            return menuItem;
        }
    }
}
