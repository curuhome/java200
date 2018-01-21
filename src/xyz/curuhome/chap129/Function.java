package xyz.curuhome.chap129;

public class Function {
    private double x;
    private double []m;
    public Function(double x,double []m){
        this.x=x;
        this.m=m;
    }//
    public Function(double []m){
        this.m=m;
    }//
    public Function(){
    }//
    private double funct(double x,double n){
        return Math.pow(x,n);
    }//
    public double functs(){
        int count=m.length;
        double value=0.0;
        for(int i=0;i<count;i++){
            value+=(m[i]*funct(x,count-1-i));
        }
        return value;
    }
    public double[] getM() {//계수 C*x^n에서 C
        return m;
    }
    public double getX() {//C*x^n에서 x
        return x;
    }
    public void setM(double[] ds) {//계수
        m = ds;
    }
    public void setX(double d) {//C*x^n에서 x
        x = d;
    }
}
