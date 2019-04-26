package moban;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-22
 * Time: 19:19
 */
public class Coffee {
    public void prepareRecipe(){
        boilWater();
        brewCoffee();
        pourInCup();
        addSugerMilk();

    }
    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void brewCoffee(){
        System.out.println("Brewing Coffee");
    }
    public void pourInCup(){
        System.out.println("Pouring in cup");
    }
    public void addSugerMilk(){
        System.out.println("Adding suger milk");
    }
}
