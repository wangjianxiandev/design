package shengchengqimoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-05
 * Time: 18:43
 */
public class Builder4d extends AbsBuilder {
    public Builder4d(String std){
        super(std);
    }
    @Override
    public void buildvacation() {
        addTicket("Plane Ticket");
        addEvent("Fly to Destination");
        addEvent("Supper");
        addHotel("Hilton");

        vacation.addDay();
        addTicket("Zoo Ticket");
        addEvent("Bus to Zoo");
        addEvent("Feed animals");
        addHotel("Hilton");

        vacation.addDay();
        addTicket("Beach");
        addEvent("Swimming");
        addHotel("Home inn");

        vacation.addDay();
        addTicket("Plane Ticket");
        addEvent("Fly to Home");
    }

    @Override
    public void buildDay(int i) {
        vacation.setVacationDay(i);
    }

    @Override
    public void addHotel(String hotel) {
        vacation.setHotel(hotel);
    }

    @Override
    public void addEvent(String event) {
        vacation.addEvent(event);
    }

    @Override
    public void addTicket(String ticket) {
        vacation.addTicket(ticket);
    }
}
