package moban;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-22
 * Time: 19:23
 */
public class Tea {
    public void prepareRecipe(){
        boilWater();
        brewTea();
        pourInCup();
        addLemon();

    }
    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void brewTea(){
        System.out.println("Brewing Tea");
    }
    public void pourInCup(){
        System.out.println("Pouring in cup");
    }
    public void addLemon(){
        System.out.println("Adding Lemon");
    }
}
