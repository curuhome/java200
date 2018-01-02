package xyz.curuhome.chap086;

public class IfLeapYear2Main {
    public static void main(String[] args) {
        IfLeapYear2 leap = new IfLeapYear2();

        leap.setYear(2004);//member 필드를 2004로
        System.out.println(leap.isLeapYear());
        leap.prints();     //2004년 윤년여부

        leap.setYear(2005);//member 필드를 2005로
//        System.out.println(leap.isLeapYear());
        leap.prints();     //2005년 윤년여부
    }
}
