package xyz.curuhome.chap109;

import xyz.curuhome.chap108.BitShift10To2;
public class BitShift2To10Main {
    public static void main(String[] args) {
        BitShift2To10 bit2 = new BitShift2To10();
        System.out.println(bit2.binTo10("111100"));
        /* 60 */

        BitShift10To2 bit=new BitShift10To2();
        bit.shift(-35);
        System.out.println(bit.showsb());
        /* 11111111111111111111111111011101 */

        System.out.println(bit2.binTo10(bit.showsb()));
        /* -35 */
    }
}
