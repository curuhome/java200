package xyz.curuhome.chap117;

import xyz.curuhome.chap114.BubbleSort;
public class LottoSameTwoMain {
    public static void main(String[] args) {
        LottoSameTwo lotto = new LottoSameTwo(10);
        lotto.make();
        BubbleSort.print(lotto.getBall());
        /* [4, 0, 1, 0, 4, 1, 3, 2, 2, 3] */

        lotto.setSame(12);
        lotto.make();
        BubbleSort.print(lotto.getBall());
        /* [3, 4, 2, 2, 5, 5, 4, 0, 1, 3, 1, 0] */
    }
}
