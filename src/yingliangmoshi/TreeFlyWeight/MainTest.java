package yingliangmoshi.TreeFlyWeight;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-06
 * Time: 19:29
 */
public class MainTest {
    public static void main(String[] args) {
        showInfo();
        TreeManager treeManager;
        treeManager = new TreeManager();
        showInfo();
        treeManager.displayTrees();
        showInfo();
    }
    public static void showInfo(){
        long max = Runtime.getRuntime().maxMemory();
        long total = Runtime.getRuntime().totalMemory();

        long free  = Runtime.getRuntime().totalMemory();

        long used = total - free;

        System.out.println("最大内存= "+ max);
        System.out.println("已分配内存= "+ total);
        System.out.println("已分配剩余内存内存= "+ free);
        System.out.println("已用内存= " + used);
        System.out.println("当前时间="+System.currentTimeMillis());
        System.out.println();


    }
}
