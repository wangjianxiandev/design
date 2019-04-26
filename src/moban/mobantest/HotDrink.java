package moban.mobantest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-22
 * Time: 19:26
 */
public abstract class HotDrink {
    public final void prepareRecipe(){//防止 子类将这个步骤进行更改
        boilWater();
        brew();
        pourInCup();
        addCondiments();
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
