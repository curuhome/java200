package xyz.curuhome.chap106;

import java.util.Date;
import java.util.Calendar;
public class CalendarAndDate {
    public static void main(String[] args) {
        Date d1 = new Date();//오늘
        System.out.println(d1.toString());
        /* Mon Jan 08 16:30:29 JST 2018 */
        Date d2 = new Date(System.currentTimeMillis()); // 오늘
        System.out.println(d2.toString());
        /* Mon Jan 08 16:30:29 JST 2018 */
        System.out.println(d1.compareTo(d2));           // d1과 d2 비교
        /* -1 */
        System.out.println(d1.after(d2));               // is d1 after day?
        /* false */
        System.out.println(d1.before(d2));              // is d2 before day?
        /* true */

        long longDays = d1.getTime();                   // 1970.1.1~
        Date d3 = (Date)d1.clone();
        d3.setTime(longDays+1000*60*60*24*3);           // 3일후
        System.out.println(d3);                         // d3에 대한 deep copy 형식
        /* Thu Jan 11 16:30:29 JST 2018 */
        System.out.println(d1);//
        /* Mon Jan 08 16:30:29 JST 2018 */

        Calendar cal = Calendar.getInstance();          // 오늘
        System.out.println(cal.toString());
        /* java.util.GregorianCalendar[time=1515396629723,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Tokyo",offset=32400000,dstSavings=0,useDaylight=false,transitions=10,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2018,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=8,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=30,SECOND=29,MILLISECOND=723,ZONE_OFFSET=32400000,DST_OFFSET=0] */
        System.out.println(cal.getTime());              // Date 리턴
        /* Mon Jan 08 16:30:29 JST 2018 */
        System.out.println(cal.getTime().getTime());    // 1970.1.1~
        /* 1515396629723 */
        System.out.println(cal.get(Calendar.YEAR));     // 현재년도
        /* 2018 */
        System.out.println(cal.get(Calendar.MONTH)+1);  // 현재월
        /* 1 */
        System.out.println(cal.get(Calendar.DATE));     // 현재날짜
        /* 8 */
        System.out.println(cal.get(Calendar.HOUR));     // 현재시간
        /* 4 */
        System.out.println(new Date(cal.getTime().getTime())); //오늘
        /* Mon Jan 08 16:30:29 JST 2018 */
    }
}
