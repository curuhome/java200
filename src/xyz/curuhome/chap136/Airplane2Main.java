package xyz.curuhome.chap136;

public class Airplane2Main {
    public static void main(String[] args) {
        Airplane2 air948 = new Airplane2("이글 파이브",6000,11);
        System.out.println(air948.toString());
        /*
            비행기 이름: 이글 파이브
            비행거리   : 66000
         */
        Airplane2 air947 = new Airplane2("센타 파이브");
        System.out.println(air947);
        /*
            비행기 이름: 센타 파이브
            비행거리   : 100000
         */
        Airplane2 air949 = new Airplane2();
        System.out.println(air949);
        /*
            비행기 이름: C10111
            비행거리   : 100000
         */
    }
}
