package xyz.curuhome.chap090;

public class OtherMathMain {
    public static void main(String[] args) {

        System.out.println(OtherMath.sub(4.6,5.7));
        /* -1.1000000000000005 */

        OtherMath other=new OtherMath(4.6,5.7);
        System.out.println(other.sum());
        /* 10.3 */
        System.out.println(other.multi());
        /* 26.22 */

        other.setA(4);
        other.setB(5);
        System.out.println(other.sum());
        /* 9.0 */
        System.out.println(other.multi());
        /* 20.0 */

    }
}
