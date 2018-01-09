package xyz.curuhome.chap111;

public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,0);
        System.out.println("p1==p2 ?"+(p1==p2));
        /* p1==p2 ?false */

        //equals overriding
        System.out.println("p1.equals(p2) ?"+(p1.equals(p2)));
        /* p1.equals(p2) ?true */
        System.out.println(p1);
        /* (0.0 , 0.0) */
        System.out.println(p2);
        /* (0.0 , 0.0) */
        System.out.println(p1.hashCode());
        /* 37 */
        System.out.println(p2.hashCode());
        /* 37 */

        Point p4 = new Point(p1);
        System.out.println(p4.hashCode());
        /* 37 */
        System.out.println("p1.equals(p4) ?"+(p1.equals(p4)));
        /* p1.equals(p4) ?true */
    }
}
