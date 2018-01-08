package xyz.curuhome.chap107;

import java.util.Calendar;
public class HowManyDays {
    private Calendar from = Calendar.getInstance();//오늘
    private Calendar to   = Calendar.getInstance();//오늘

    HowManyDays(){ }
    /*
    public HowManyDays(Calendar from,Calendar to){
        setFrom(from);
        setTo(to);
    }
    */
    public int howManyDays(){
        int aDay = 1000 * 60 * 60 * 24;
        return (int)( (to.getTime().getTime() - from.getTime().getTime() )/ aDay);
    }
    public void setFrom(Calendar from){
        this.from = from;
    }
    public void setTo(Calendar to){
        this.to = to;
    }
    public static Calendar makeDay(int year, int month, int day){
        Calendar making = Calendar.getInstance();//오늘
        making.set(year,month-1,day);
        return making;
    }
}
