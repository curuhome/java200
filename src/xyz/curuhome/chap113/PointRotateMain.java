package xyz.curuhome.chap113;

import xyz.curuhome.chap111.Point;
public class PointRotateMain {
    public static void main(String[] args) {
        PointRotate ro = new PointRotate();

        Point p1 = new Point(4,4);
        Point p2 = ro.rotate(p1,90);//90도 회전
        System.out.println(p2);
        /* (-3.9999999999999996 , 4.0) */

        Point p3 = ro.rotate(p1,45);//45도 회전
        System.out.println(p3);
        /* (4.440892098500626E-16 , 5.65685424949238) */
    }
}
