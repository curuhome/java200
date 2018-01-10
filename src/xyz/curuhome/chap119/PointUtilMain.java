package xyz.curuhome.chap119;

import xyz.curuhome.chap111.Point;
public class PointUtilMain {
    public static void main(String[] args)
    {
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);
        Point p3 = new Point(4,3);
        double length1 = PointUtil.length(p1,p2);
        System.out.println(length1);
        /* 5.0 */

        double area1 = PointUtil.area(p1,p2,p3);
        System.out.println(area1);
        /* 3.5 */

        Point p4 = PointUtil.move(p2,p3);//p2를 p3만큼이동
        System.out.println(p4);
        /* (7.0 , 7.0) */

        Point p5=PointUtil.move(p2,2,4);//p2를 (2,4)만큼이동
        System.out.println(p5);
        /* (5.0 , 8.0) */
    }
}
