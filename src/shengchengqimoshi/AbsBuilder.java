package shengchengqimoshi;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-05
 * Time: 18:33
 */
public abstract class AbsBuilder {
    public Vacation vacation;
    public AbsBuilder(String std){
        vacation = new Vacation(std);
    }
    //按步骤写好
    public abstract void buildvacation();
    public abstract void buildDay(int i);
    public abstract void addHotel(String hotel);
    public abstract void addEvent(String event);
    public abstract void addTicket(String ticket);

    public Vacation getVacation() {
        return vacation;
    }
}
