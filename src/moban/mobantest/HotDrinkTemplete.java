package moban.mobantest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-22
 * Time: 19:58
 */
public abstract class HotDrinkTemplete {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(wantCondimentsHook()){
            addCondiments();
        }else{
            System.out.println("None");
        }
    }
    public boolean wantCondimentsHook(){
        return true;
    }
    public final void boilWater(){
        System.out.println("Boiling water");
    }
    public abstract void brew();
    public final void pourInCup(){
        System.out.println("Pouring in cup");
    }
    public abstract void addCondiments();
}
