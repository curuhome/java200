package xyz.curuhome.chap118;

import xyz.curuhome.chap114.BubbleSort;
public class LottoSameThreeMain {
    public static void main(String[] args) {
        LottoSameThree lotto = new LottoSameThree(12);
        lotto.make();
        BubbleSort.print(lotto.getBall());
        /* [0, 0, 3, 3, 2, 0, 2, 1, 3, 1, 1, 2] */

        lotto.setSame(18);
        lotto.make();
        BubbleSort.print(lotto.getBall());
        /* [4, 3, 2, 5, 2, 5, 2, 0, 3, 4, 0, 1, 1, 4, 0, 1, 3, 5] */
    }
}
