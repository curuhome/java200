package xyz.curuhome.chap137;

import xyz.curuhome.chap136.Airplane2;
public class AmphibiousPlane extends Airplane2{
    private String landingZone = "Kansai Airport";    // 착륙위치
    private int number = 5;
    public AmphibiousPlane(String nameOfAirp, int fuel, int goPerL, String landingZone, int number){
        super(nameOfAirp, fuel, goPerL);            // 부모멤버초기화
        this.landingZone=landingZone;
        this.number=number;
    }
    public AmphibiousPlane(String nameOfAirp, int fuel, String landingZone, int number){
        this(nameOfAirp,fuel,10,landingZone,number);
    }
    public AmphibiousPlane(){
        // 자식 클래스의 생성자에 this나 super 생성자가 없다면
        // 첫번째 줄에 자동으로 super 생성자가 추가된다.
        // super();

        //this("C10111",10000,10, "sea 110 123",5);
    }
    public String getLandingZone(){
        return getNameOfAirp()+"의 착륙위치:"+landingZone;
    }
    public int getNumber(){return number;}
    //public int getFuel() {return super.fuel;}//super의 멤버가 private이라 X
    public String toString(){
        String s;
        if(getFuel()>999){//getFuel()
            s = super.toString();//부모 클래스 toString()
            s+="\n착륙위치는: "+landingZone;
            s+="\n승객인원: "+number+"\n";
        }else{
            s = super.toString();
        }
        return s;
    }
}
