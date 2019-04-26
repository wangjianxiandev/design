package gongchangmoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-16
 * Time: 12:19
 */
public abstract class Pizza {
    protected String name;
    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }


    public abstract void prepare();
    public void bake(){
        System.out.println(name + "baking");
    }
    public void cut(){
        System.out.println(name + "cutting");
    }
    public void box(){
        System.out.println(name + "boxing");
    }
}
