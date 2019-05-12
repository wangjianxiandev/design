package beiwanglumoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-10
 * Time: 9:17
 */
public class MainTest {
    public static void main(String[] args) {
        MenmentoCaretaker menmentoCaretaker = new MenmentoCaretaker();
        Originator originator  = new Originator();
        Originator2 originator2 = new Originator2();
        System.out.println("****** Originator1******");
        originator.testState1();
        //保存到外部
        menmentoCaretaker.saveMemento("Originator", originator.createMemento());
        originator.showState();

        originator.testState2();
        originator.showState();
        //觉得2不好，返回之前的保存的进度
        originator.restoreMemento(menmentoCaretaker.regetMemento("Originator"));
        originator.showState();




        System.out.println("*****Orginator2******");
        originator2.testState1();
        originator2.showState();

        menmentoCaretaker.saveMemento("Originator2", originator.createMemento());
        originator2.testState2();
        originator2.showState();
        originator2.restoreMemento(menmentoCaretaker.regetMemento("Originator2"));
        originator2.showState();
        System.out.println("*****Originator&&Originator 2*****");
        originator.restoreMemento(menmentoCaretaker.regetMemento("Originator2"));
        originator.showState();

    }
}
