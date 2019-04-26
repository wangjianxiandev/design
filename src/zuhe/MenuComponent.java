package zuhe;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 19:54
 */
public abstract class  MenuComponent {
    public String getName(){
        return "";
    }
    public String getDdescription(){
        return "";
    }
    public float getPrice(){
        return 0;
    }
    public boolean isVegetable(){
        return false;
    }
    public Iterator getIterator(){
        return new NullIterator();
    }
    public abstract void print();
}
