package xyz.curuhome.chap124;

public class GCDUsingWhileMain {
    public static void main(String[] args)
    {
        GCDUsingWhile gcd = new GCDUsingWhile();
        System.out.println("15와 80의 최대공약수 "+gcd.gcd(15,80));
        /* 15와 80의 최대공약수 5 */

        System.out.println("15와 80의 최소공약수 "+gcd.lcm(15,80));
        /* 15와 80의 최소공약수 240 */
    }
}
