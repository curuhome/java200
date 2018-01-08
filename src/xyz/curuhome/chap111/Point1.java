package xyz.curuhome.chap111;

public class Point1 {
    private double x;  // x좌표
    private double y;  // y좌표
    Point1(double x,double y){
        this.x=x;
        this.y=y;
    }
    Point1(Point1 xp){
        this.x=xp.getX();
        this.y=xp.getY();
    }
    private double getX() {
        return x;
    }
    private double getY() {
        return y;
    }
    public String toString(){
        return "("+x+" , "+y+")";
    }
}
