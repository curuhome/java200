package xyz.curuhome.chap090;

public class OtherMath {
    private double a;
    private double b;

    public OtherMath(double a, double b){
        this.a=a;
        this.b=b;
    }
    public void setA(double a) {
        this.a=a;
    }
    public void setB(double b) {
        this.b=b;
    }
    public double multi(){
        // static으로 선언되어 있지 않아서, 클래스 이름으로 메소드 호출 불가
        // 객체 생성하고 레퍼런스를 이용하여 호출해야함.
        BasicMath basic=new BasicMath();
        return basic.multi(a,b);
    }
    public double sum(){
        // static으로 선언되어 있는 경우, 클래스 이름으로 메소드 호출가능
        return BasicMath.sum(a,b);
    }
    public static double sub(double aa, double bb){
        return BasicMath.sub(aa,bb);
    }
}
