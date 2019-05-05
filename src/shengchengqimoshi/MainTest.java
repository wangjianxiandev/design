package shengchengqimoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-05
 * Time: 18:46
 */
public class MainTest {
    public static void main(String[] args) {
        Director director = new Director(new Builder4d("2015-12-29"));
        director.construct();
        director.setBuilder(new Builder3d("2015-8-30"));
        director.construct();

        testSelf();
    }

    public static void testSelf(){
        BuilderSelf builderSelf = new BuilderSelf("2015-12-29");
        builderSelf.addTicket("Plane").addEvent("Fly to").addEvent("Supper").addHotel("Home");
        builderSelf.addDay().addTicket("Plane2").addEvent("Fly to2").addEvent("Supper2").addHotel("Home2");
        builderSelf.addDay().addTicket("Plane3").addEvent("Fly to3").addEvent("Supper3").addHotel("Home3");
        builderSelf.addDay().addTicket("Plane4").addEvent("Fly to4").addEvent("Supper4").addHotel("Home4");
    builderSelf.getVacation().showInfo();
    }
}
