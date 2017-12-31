package xyz.curuhome.chap077;

public class ArrayMethodMain {

    public static void main(String[] args) {

        int a=5;
        int b=6;
        ArrayMethod.copyVInt(a,b); // call by value (5,6) // p = q
        System.out.println(a);     // 5 변경안됨
        System.out.println(b);     // 6 변경안됨

        ArrayMethod.multi(a);      // call by value (5)   // q = q * 10
        System.out.println(a);     // 5 변경안됨

        int[] aa = {5,4,7,1,9,12,0,3,2,6};
        int[] bb = new int[aa.length];

        int[] cc = {5,4,7,1,9,12,0,3,2,6};
        int[] dd = new int[cc.length];

        ArrayMethod.copyR(aa,bb);  //call by reference로 copy(복사불가)
        ArrayMethod.print(bb);
        /* [0] [0] [0] [0] [0] [0] [0] [0] [0] [0] */

        ArrayMethod.copyRChange(aa,bb);
        ArrayMethod.print(bb);
        /* [0] [0] [0] [0] [0] [0] [0] [0] [0] [0] */

        ArrayMethod.print(aa);
        /* [35] [4] [7] [1] [9] [12] [0] [3] [2] [6] */

        ArrayMethod.bbsort(aa);    //call by reference로 sorting(오름차순)
        ArrayMethod.print(aa);
        /* [0] [1] [2] [3] [4] [6] [7] [9] [12] [35] */

        ArrayMethod.copyV(cc,dd);  //call by value로 copy(복사가능)
        ArrayMethod.print(dd);     //dd의 값들은 모두 0
        /* [5] [4] [7] [1] [9] [12] [0] [3] [2] [6] */
    }
}
