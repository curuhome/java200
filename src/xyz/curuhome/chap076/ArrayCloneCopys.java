package xyz.curuhome.chap076;

public class ArrayCloneCopys {
    public static void main(String[] args) {
        /*
        1차원 배열 clone-> deep copy(value)
        2차원 배열 clone-> shallow copy(reference)
        */

        // int[] a = {8,5,2,4,6,3,7,9};
        int[] b = {8,5,2,4,6,3,7,9};
        // int[] c = a;                                        //shallow copy
        int[] d = new int[b.length];
        System.arraycopy(b,0,d,0,b.length);   //deep copy
        int[] e = b.clone(); //clone을 지원하지 않으면 CloneNotSupportedException 발생
        print(e);
        /* [8] [5] [2] [4] [6] [3] [7] [8] */
        b[4]=-2;
        print(e);
        /* [8] [5] [2] [4] [6] [3] [7] [8] */

        int[][] fa={{4,5,6,7},{6,7,8,9}};
        int[][] fb=fa.clone();
        fa[0][0]=-1;
        print(fb);
        /*
        [-1] [5] [6] [7]
        [6] [7] [8] [9]
         */

        //2차원 배열을 deep copy 시키기 위해서
        int[][] fc = new int[fa.length][fa[0].length];
        for(int i=0;i<fa.length;i++){
            fc[i] = fa[i].clone();
        }
        fa[0][0]=-5;
        print(fc);//fc는 fa변화에 영향을 받지 않는다.
    }
    public static void print(int[] p){
        for(int i=0;i<p.length;i++){
            System.out.print("["+p[i]+"] ");
        }
        System.out.println();
    }
    public static void print(int[][] p){
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p[i].length;j++){
                System.out.print("["+p[i][j]+"] ");
            }
            System.out.println();
        }
    }
}
