package xyz.curuhome.chap104;

public class ArrayPrint {
    public static void print(int[][] a){
        //m*n
        int m = a.length;
        for(int i=0;i<m;i++){
            int n=a[i].length;
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }//for
    }//print(int[][] a)

    public static void print(int[] a){
        int m = a.length;
        for(int i=0; i<m; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }//print(int[] a)
}
