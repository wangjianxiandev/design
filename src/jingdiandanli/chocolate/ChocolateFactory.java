package jingdiandanli.chocolate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-16
 * Time: 10:03
 */
public class ChocolateFactory {
    private boolean empty;
    private boolean boiled;
    public static ChocolateFactory uniqueInstance = null;
    private ChocolateFactory(){empty = true;
    boiled = true;
    }
    public static ChocolateFactory getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ChocolateFactory();
        }
        return uniqueInstance;
    }
    public void fill(){
        if(empty){
            empty = false;
            boiled = false;
        }
    }
    public void drain(){
        if((!empty)&&boiled){
            empty = true;
            boiled = true;
        }
    }
}
