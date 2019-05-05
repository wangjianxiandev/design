package shengchengqimoshi;

import javax.lang.model.type.ArrayType;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-04
 * Time: 16:47
 */
public class VacationDay {

    private Date mdate;
    private String mHotels;
    private ArrayList<String> tickets = null;
    ArrayList<String> events = null;
    public VacationDay(Date date){
        mdate = date;
        tickets = new ArrayList<String>();
        events = new ArrayList<String>();
    }
    public void setDate(Date date) {
        this.mdate = date;
    }


    public void setHotels(String hotels) {
        this.mHotels = hotels;
    }
    public void addTicket(String ticket){
        tickets.add(ticket);
    }
    public void addEvent(String event){
        events.add(event);
    }
    public String showInfo(){
        StringBuilder stringBuilder = new StringBuilder(); //StringBuilde就是Java中的一个生成器模式
        stringBuilder.append("Date:" + mdate.toString()+'\n');
        stringBuilder.append("Hotel:"+mHotels+'\n');
        stringBuilder.append("Tickets:"+tickets.toString()+'\n');
        stringBuilder.append("Events:"+events.toString()+'\n');
        return stringBuilder.toString();
    }

}
