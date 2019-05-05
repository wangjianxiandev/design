package shengchengqimoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-05
 * Time: 18:36
 */
public class Builder3d extends AbsBuilder {
    public Builder3d(String std){
        super(std);
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

    @Override
    public void buildvacation() {
        addTicket("Plane ticket");
        addEvent("Fly to dest");
        addEvent("Supper");
        addEvent("Dancing");
        addHotel("Four stars");

        vacation.addDay();
        addTicket("Theme park");
        addEvent("Bus to park");
        addEvent("lunch");
        addHotel("Four stars");

        vacation.addDay();
        addTicket("Planr Ticket");
        addEvent("City tour");
        addEvent("Fly to home");

    }
}
