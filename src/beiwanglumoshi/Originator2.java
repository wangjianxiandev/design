package beiwanglumoshi;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-10
 * Time: 9:12
 */
public class Originator2 {
    //英雄血量大小等等
    private ArrayList<String> state;

    public Originator2(){
        state = new ArrayList<>();
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
        state = new ArrayList<String>();
        state.add("blood:320");
        state.add("progress:gate2 mid");
        state.add("enemy: 15");
    }

    public void testState2(){
        state = new ArrayList<String>();
        state.add("blood:230");
        state.add("progress: gate8 start");
        state.add("enemy:13");
    }



    private class Memento implements MementoIF{
        private ArrayList<String> state;

        private Memento(ArrayList<String> state){
            //赋值到具体的内容，相当于clone一份，如果把引用给他就会指向同一个内存区域，就无法进行保存更改
            this.state = new ArrayList(state);
        }

        public ArrayList<String> getState() {
            return state;
        }

        public void setState(ArrayList<String> state) {
            this.state = state;
        }
    }
}
