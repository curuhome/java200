package xyz.curuhome.chap089;

public class BitShiftingMain {
    public static void main(String[] args) {
        BitShifting bit=new BitShifting();
        System.out.println(bit.makeBit(40));
        /* 00101000 */

        System.out.println(bit.makeBit(40,2));
        /* 00001010 */

        System.out.println(bit.makeBit(40,-2));
        /* 10100000 */
    }
}
