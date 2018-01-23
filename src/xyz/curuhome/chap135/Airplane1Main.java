package xyz.curuhome.chap135;

public class Airplane1Main {
    public static void main(String[] args) {
        Airplane1 air948 = new Airplane1("이글 파이브",6000,11);
        //생성자 -- 멤버 필드의 초기화
        System.out.println(air948.toString());
        /*
            비행기 이름: 이글 파이브
            비행거리   : 66000
         */

        System.out.println("============================================");
        Airplane1 air947 = new Airplane1("센타 파이브",100);
        /* 연료부족위험 */

        System.out.println(air947);
        /* 이 비행기는 출발할 수 없는 비행기 입니다. */
    }
}
