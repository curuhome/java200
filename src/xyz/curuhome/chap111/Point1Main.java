package xyz.curuhome.chap111;

public class Point1Main {
    public static void main(String[] args) {
        Point1 p1 = new Point1(0,0);
        Point1 p2 = new Point1(0,0);
        Point1 p3 = new Point1(4,3);
        System.out.println("p1==p2 ?"+(p1==p2));
        /* p1==p2 ?false */
        System.out.println("p1.equals(p2) ?"+(p1.equals(p2)));
        /* p1.equals(p2) ?false */
        System.out.println(p1);
        /* (0.0 , 0.0) */
        System.out.println(p2);
        /* (0.0 , 0.0) */
        System.out.println(p1.hashCode());
        /* 1163157884 */
        System.out.println(p2.hashCode());
        /* 1956725890 */

        Point1 p4 = new Point1(p1);
        System.out.println(p4.hashCode());
        /* 356573597 */
        System.out.println("p1.equals(p4) ?"+(p1.equals(p4)));
        /* p1.equals(p4) ?false */
    }
}
