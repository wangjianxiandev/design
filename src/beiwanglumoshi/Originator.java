package beiwanglumoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-10
 * Time: 8:35
 */

import java.util.HashMap;

/**
 * 发起者
 */
public class Originator {
    //英雄血量大小等等
    private HashMap<String, String> state;

    public Originator(){
        state = new HashMap<String, String>();
    }

    public MementoIF createMemento(){
        //保存了一个副本
        return new Memento(state);
    }

    public void restoreMemento(MementoIF memento){
        state = ((Memento) memento).getState();
    }

    public void showState(){
        System.out.println("now state:"+state.toString());
    }

    public void testState1(){
        state.put("blood", "500");
        state.put("progress", "gatel end");
        state.put("enemy","5");
    }

    public void testState2(){
        state.put("blood", "450");
        state.put("progress", "gate3 start");
        state.put("enemy", "3");
    }


    //私有的外部看不到
    private class Memento implements MementoIF{

        private HashMap<String,String> state;

        private Memento(HashMap state){
            //赋值到具体的内容，相当于clone一份，如果把引用给他就会指向同一个内存区域，如过更改就无法保证一致性
            this.state = new HashMap<>(state);
        }

        public HashMap<String, String> getState() {
            return state;
        }

        public void setState(HashMap<String, String> state) {
            this.state = state;
        }
    }
}
