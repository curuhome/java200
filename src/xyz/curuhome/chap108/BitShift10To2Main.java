package xyz.curuhome.chap108;

public class BitShift10To2Main {
    public static void main(String[] args) {
        BitShift10To2 bit=new BitShift10To2();
        bit.shift(Integer.MAX_VALUE);
        System.out.println(bit.showsb());
        /* 11111111 */
        bit.shift(4);
        System.out.println(bit.showsb());
        /* 00000100 */
        bit.shift(-4);
        System.out.println(bit.showsb());
        /* 11111100 */
    }
}
