package moban.paixuyazi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-22
 * Time: 20:23
 */
public abstract class SortTemplete {
    public final void sort(Object[] objects){
        for(int i = 0;i<objects.length;i++){
            if(campare(objects[i+1])>0){
                //swap();
            }else{

            }
        }
    }
    public abstract int campare(Object object);
}
