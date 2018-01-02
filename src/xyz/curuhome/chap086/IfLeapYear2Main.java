package xyz.curuhome.chap086;

public class IfLeapYear2Main {
    public static void main(String[] args) {
        IfLeapYear2 leap = new IfLeapYear2();

        leap.setYear(2004); // member 필드를 2004로 대입
        System.out.println(leap.isLeapYear());
        /* true */
        leap.prints();      // 2004년 윤년여부(true)
        /* 2004는 윤년입니다.  */

        leap.setYear(2005); // member 필드를 2005로 대입
//        System.out.println(leap.isLeapYear());
        leap.prints();      // 2005년 윤년여부(false)
        /* 2005는 윤년이 아닙니다. */
    }
}
