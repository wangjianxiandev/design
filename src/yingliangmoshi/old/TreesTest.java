package yingliangmoshi.old;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-06
 * Time: 19:09
 */
public class TreesTest {
    private int length = 1000000;
    private Tree[] treeList = new Tree[length];
    public TreesTest(){
        for(int i = 0;i<length;i++){
            treeList[i] = new Tree((int)(Math.random() * length), (int)(Math.random() * length), (int)(Math.random() * length)%5);
        }
    }

    public void display() {
        for(int i =  0; i<treeList.length;i++){
            treeList[i].display();
        }
    }
}
