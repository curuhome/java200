package xyz.curuhome.chap135;

public class AirplaneMain {
    public static void main(String[] args) {
        Airplane air858 = new Airplane();
        air858.nameOfAirp = "손오공";        //비행기이름
        air858.fuel = 6000;                 //liter
        //air858.fuel=100;                  //100liter 이하면 연료부족?!
        air858.goPerL=11;                   //1km/liter
        System.out.print("  비행기 이름: "+air858.nameOfAirp+"\n");
        /* 비행기 이름: 손오공 */

        System.out.print("  비행거리   : "+air858.goPerL*air858.fuel+"km\n");
        /* 비행거리   : 1089km */
    }
}
