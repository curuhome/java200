package xyz.curuhome.chap113;

import xyz.curuhome.chap111.Point;
import xyz.curuhome.chap112.Matrix;
public class PointRotate {
    public Point rotate(Point p1, double r){
        Matrix mat = new Matrix();
        //2*2 X 2*1 == 2*1
        return toPoint(mat.matMulti( toRotate(r), toMatxi(p1) ));
    }
    private double[][] toMatxi(Point p1){
        double[][] matp = new double[2][1];
        matp[0][0] = p1.getX();
        matp[1][0] = p1.getY();
        return matp;
    }
    private double[][] toRotate(double r){
        double[][] matp = new double[2][2];
        matp[0][0] =  Math.cos(Math.toRadians(r));
        matp[0][1] =- Math.sin(Math.toRadians(r));
        matp[1][0] =  Math.sin(Math.toRadians(r));
        matp[1][1] =  Math.cos(Math.toRadians(r));
        return matp;
    }
    private Point toPoint(double[][] po){
        return new Point(po[0][0],po[1][0]);
    }
}
