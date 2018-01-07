package xyz.curuhome.chap099;

import xyz.curuhome.chap098.Ant;
import xyz.curuhome.chap098.WaterAnt;
public class AntMain {
    public static void main(String[] args) {
        Ant ant = new Ant();
        ant.print();
        /* Ant은 동굴에 산다. */
        System.out.println(ant.toString());
        /* 이름  : Ant */

        WaterAnt want = new WaterAnt();
        want.print();
        /* Ant은 water에 산다. */
        want.show();
        /* water주변 */
        System.out.println(want.toString());
        /* 이름  : Ant */

        WoodAnt dant = new WoodAnt();
        dant.print();
        /* Ant은 wood에 산다. */
        dant.hate();
        /* wood새 */
        System.out.println(dant.toString());
        /* 이름  : Ant */
    }
}
