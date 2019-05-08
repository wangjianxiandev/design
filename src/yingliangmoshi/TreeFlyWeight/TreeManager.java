package yingliangmoshi.TreeFlyWeight;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-06
 * Time: 19:26
 */

/**
 * 处理外部状态
 */
public class TreeManager {
    public int length = 1000000;
    //将外部状态放到数组中
    int[] xArray = new int[length];
    int[] yArray = new int[length];
    int[] ageArray = new int[length];
    private TreeFlyWeight treeFlyWeight;
    public TreeManager(){
        treeFlyWeight = new TreeFlyWeight();
        for(int i = 0;i<length;i++){
            xArray[i] = (int)(Math.random() * length);
            yArray[i] = (int)(Math.random() * length);
            ageArray[i] =(int)(Math.random() * length)%5;
        }
    }

    public void displayTrees(){
        for(int i= 0;i<length;i++){
            treeFlyWeight.display(xArray[i], yArray[i], ageArray[i]);
        }
    }

}
