package shengchengqimoshi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-04
 * Time: 16:55
 */
public class Vacation {
    private ArrayList<VacationDay> vacationDayList;
    private Date mStDate;
    private int mDays = 0;
    private VacationDay vacationDay;
    public Vacation (String std){
        vacationDayList = new ArrayList<VacationDay>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            mStDate = sdf.parse(std);
            vacationDay = new VacationDay(mStDate);
            vacationDayList.add(vacationDay);
            mDays++;
        }catch(ParseException e){
            e.printStackTrace();
        }
    }

    public void setmStDate(String std){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            mStDate = sdf.parse(std);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

    public Date getmStDate(){
        return mStDate;
    }

    public void addDay(){
        vacationDay = new VacationDay(nextDate(mDays));
        vacationDayList.add(vacationDay);
        mDays++;
    }

    public boolean setVacationDay(int i){
        if((i>0) && (i<vacationDayList.size())){
            vacationDay = vacationDayList.get(i);
            return true;
        }
        vacationDay = null;
        return false;
    }

    public void setHotel(String mHotels){
        vacationDay.setHotels(mHotels);
    }

    public void addTicket(String ticket){
        vacationDay.addTicket(ticket);
    }

    public void addEvent(String event){
        vacationDay.addEvent(event);
    }

    public void showInfo(){
        for(int i =0;i<vacationDayList.size();i++){
            System.out.println("**" +(i+1) + "day**");
            System.out.println(vacationDayList.get(i).showInfo());
        }
    }

    private Date nextDate(int n){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(mStDate);
        calendar.add(Calendar.DATE, n);
        return calendar.getTime();
    }

}
