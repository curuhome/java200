package xyz.curuhome.chap122;

public class NumberCountingMain {
    public static void main(String[] args) {
        NumberCounting nc = new NumberCounting();
        System.out.println("123: "+nc.numberSum(123));
        /* 123: 6 */

        System.out.println("2: "+nc.numberSum(2));
        /* 2: 2 */

        System.out.println("5354354 : "+nc.numberSum(5354354));
        /* 5354354 : 29 */
    }
}
