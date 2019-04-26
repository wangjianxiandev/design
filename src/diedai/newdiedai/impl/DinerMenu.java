package diedai.newdiedai.impl;


import diedai.olddiedai.MenuItem;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 16:23
 */
public class DinerMenu {
    private final static int MAX_ITEM = 5;
    public int numberOfItems = 0;//设置数组中指向当前元素的指针

    private MenuItem[] menuItems;
    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEM];
        addItem("KFCnew", "boiled1", true, 3.34f);
        addItem("KMnew", "boiled water1", true, 3.34f);
    }
    private void addItem(String name, String description, boolean vegetable, float price){
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        if(numberOfItems>=MAX_ITEM){
            System.out.println("Sorry, isfull");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }
    public Iterator getIterator(){
        return new DinerIterator();
    }
    class DinerIterator implements Iterator {
        private int position;
        public DinerIterator(){
            position = 0;
        }

        @Override
        public boolean hasNext() {
            if(position<numberOfItems){
                return true;
            }
            return false;
        }
        @Override
        public void remove(){

        }

        @Override
        public Object next() {
            MenuItem menuItem = menuItems[position];
            position++;
            return menuItem;
        }
    }
}
