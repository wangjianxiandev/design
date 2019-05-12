package beiwanglumoshi;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-10
 * Time: 8:33
 */

/**
 * 管理者操作接口对象
 */
public class MenmentoCaretaker {
    //用来存储备忘录对象
    private HashMap<String, MementoIF> mementoIFHashMap;

    public MenmentoCaretaker(){
        mementoIFHashMap = new HashMap<String, MementoIF>();
    }

    //获得已经存储的备忘录对象
    public MementoIF regetMemento(String name){
        return mementoIFHashMap.get(name);
    }

    //保存备忘录
    public void saveMemento(String name, MementoIF mementoIF){
        //如果名字和之前的相同，就会覆盖
        this.mementoIFHashMap.put(name, mementoIF);
    }
}
