package xyz.curuhome.chap116;

import xyz.curuhome.chap114.BubbleSort;
public class LottoMain {
    public static void main(String[] args) {
        Lotto lotto  = new Lotto();
        BubbleSort bubble = new BubbleSort();
        lotto.make();
        BubbleSort.print(lotto.getBall());
        /* [34, 16, 23, 3, 26, 38]*/

        int [] b = bubble.bbsortinc(lotto.getBall());
        BubbleSort.print(b);//로또
        /* [3, 16, 23, 26, 34, 38] */
    }
}
