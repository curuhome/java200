package xyz.curuhome.chap074;

public class ArrayInit {
    public static void main(String[] args) {
        int[] a;
        a = new int[5];
        a[0] = 2; a[1] = 5; a[2] = 3; a[3] = 9; a[4] = 8;
        //int[] b = new int[]{2,5,3,9,8};
        //int[] c = {2,5,3,9,8};
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + "\t");
        }
        System.out.println();

        int[] d = a; // Shallow copy
        a[4] = 55;   // a의 값을 변동시키면 d의 값이 바꿜까?
        for(int i=0;i<a.length;i++){
            System.out.print(d[i]+"\t");
        }
        System.out.println();

        int[] e = new int[5];
        System.arraycopy(d,0, e,0, d.length); //Deep copy
        d[4] = 100; // d의 값을 변동시키면 e의 값이 바꿜까?
        for(int i=0;i<e.length;i++){
            System.out.print(e[i]+"\t");
        }

        boolean[] bb = new boolean[5];
        System.out.println(bb[0]);
    }
}
/*
2	5	3	9	8
2	5	3	9	55
2	5	3	9	55	false
*/