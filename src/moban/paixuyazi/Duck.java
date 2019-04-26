package moban.paixuyazi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-22
 * Time: 20:23
 */
public class Duck implements Comparable {
    String name = "";
    int weight = 1;
    public Duck(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String toString(){
        return name + " weight:" +weight;
    }
    @Override
    public int compareTo(Object o) {
        Duck buf = (Duck) o;
        if(this.weight>buf.weight){
            return 1;
        }else if(this.weight < buf.weight){
            return -1;
        }
        return  0;
    }
}
