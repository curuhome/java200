package xyz.curuhome.chap085;

public class TankMain {
    public static void main(String[] args) {
        System.out.println(Tank.howmany);
        /* 0 */
        System.out.println(Tank.getHowMany());
        /* 0 */

        Tank tiger = new Tank();
        Tank black = new Tank();
        Tank cats  = new Tank();
        Tank hawk  = new Tank();
        System.out.println(tiger.howfast);        // member
        /* 100 */

        tiger.input();		tiger.increase();
        black.input();		black.increase();
        cats.input();		cats.increase();
        hawk.input();		hawk.increase();

        tiger.showShortLife();
        tiger.showShortLife();
        System.out.println(Tank.getHowMany());      // static
        /* 4 */
        System.out.println(tiger.getHowFast());     // member
        /* 120 */

        System.out.println(tiger);                  // type@hashCode
        /* xyz.curuhome.chap085.Tank@4554617c */
        System.out.println(black);
        /* xyz.curuhome.chap085.Tank@74a14482 */
        System.out.println(cats);
        /* xyz.curuhome.chap085.Tank@1540e19d */
        System.out.println(hawk);
        /* xyz.curuhome.chap085.Tank@677327b6 */

        tiger=null;                                 //garbage collection 대상
        System.out.println(tiger);//type@hashCode
        /* null */
    }
}
