package xyz.curuhome.chap098;

public class WaterAntMain {
    public static void main(String[] args) {
        Ant ant = new Ant();
        ant.print();
        /* Ant은 동굴에 산다.*/
        System.out.println(ant.toString());
        /* 이름  : Ant */

        WaterAnt want = new WaterAnt();
        want.print();
        /* Ant은 water에 산다. */
        want.show();
        /* water주변 */
        System.out.println(want.toString());
        /* 이름  : Ant */
    }
}
