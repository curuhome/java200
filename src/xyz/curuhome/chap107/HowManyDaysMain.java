package xyz.curuhome.chap107;

public class HowManyDaysMain {
    public static void main(String[] args) {
        HowManyDays how = new HowManyDays();
        System.out.println(how.howManyDays());
        /* 0 */

        how.setFrom(HowManyDays.makeDay(2015,9,1));
        how.setTo(HowManyDays.makeDay(2017,12,7));
        //경과일 2015,9,1~2017,12,7

        System.out.println(how.howManyDays());
        /* 828 */
        System.out.println(how.howManyDays()*24);
        /* 19872 */
        System.out.println(how.howManyDays()*24*60);
        /* 1192320 */
    }
}
