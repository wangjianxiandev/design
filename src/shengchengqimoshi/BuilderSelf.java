package shengchengqimoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-05
 * Time: 19:00
 */
public class BuilderSelf {
    public Vacation vacation;

    public BuilderSelf(String std){
        vacation = new Vacation(std);
    }
    public BuilderSelf addDay() {
        // TODO Auto-generated method stub

        vacation.addDay();
        return this;
    }

    public BuilderSelf buildDay(int i) {
        // TODO Auto-generated method stub

        vacation.setVacationDay(i);
        return this;
    }

    public BuilderSelf addHotel(String hotel) {
        // TODO Auto-generated method stub
        vacation.setHotel(hotel);
        return this;
    }

    public BuilderSelf addTicket(String ticket) {
        // TODO Auto-generated method stub
        vacation.addTicket(ticket);
        return this;
    }

    public BuilderSelf addEvent(String event) {
        // TODO Auto-generated method stub
        vacation.addEvent(event);
        return this;
    }

    public Vacation getVacation() {

        return vacation;

    }
}
