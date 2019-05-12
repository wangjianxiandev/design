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
    //英雄血量大小等等属性信息
    private HashMap<String, String> state;

    public Originator(){
        state = new HashMap<String, String>();
    }


    //创建备忘录
    public MementoIF createMemento(){
        //保存了一个副本
        return new Memento(state);
    }

    //恢复
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




    //备忘录对象私有的外部看不到
    private class Memento implements MementoIF{

        private HashMap<String,String> state;

        private Memento(HashMap state){
            //为什么新建一个对象，因为之前的赋值情况是赋值一个引用，赋值到具体的内容，相当于clone一份，如果把引用给他就会指向同一个内存区域，如过更改就无法保证一致性
            //this.state指的是Originator中的state, 如果将这个state和Originator中的state绑定那么就会指向同一个内存区域
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
