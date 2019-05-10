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
    public MementoIF retrieveMemento(String name){
        return mementoIFHashMap.get(name);
    }

    /**
     * 备忘录赋值
     */
    public void saveMemento(String name, MementoIF mementoIF){
        this.mementoIFHashMap.put(name, mementoIF);
    }
}
