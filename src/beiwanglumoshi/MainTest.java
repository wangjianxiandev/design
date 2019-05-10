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
        System.out.println("****** Origin******");
        originator.testState1();
        menmentoCaretaker.saveMemento("Originator", originator.createMemento());
        originator.showState();
        originator.testState2();
        originator.restoreMemento(menmentoCaretaker.retrieveMemento("Originator"));
        originator.showState();
        System.out.println("*****Orginator2******");
        originator2.testState1();
        originator2.showState();;
        menmentoCaretaker.saveMemento("Originator2", originator.createMemento());
        originator.testState2();
        originator2.showState();
        originator.restoreMemento(menmentoCaretaker.retrieveMemento("Originator2"));
        originator2.showState();
        System.out.println("*****Originator&&Originator 2*****");
        originator.restoreMemento(menmentoCaretaker.retrieveMemento("Originator2"));
        originator.showState();

    }
}
