package xyz.curuhome.chap112;

public class MatrixMain {
    public static void main(String[] args) {
        Matrix mat = new Matrix();
        double[][] a = {{1,2,3},{4,5,6}};   // 2*3
        double[][] b = {{1,2},{3,4},{5,6}}; // 3*2
        double[][] c = {{1,2,3},{4,5,6},{7,8,9}};
        double[][] d = {{1,0,0},{0,1,0},{0,0,1}};
        Matrix.prints(a);
        /*
            [ 1.0 , 2.0 , 3.0 ]
            [ 4.0 , 5.0 , 6.0 ]
         */
        System.out.println("\n --------- X -----------------\n");
        Matrix.prints(b);
        /*
            [ 1.0 , 2.0 ]
            [ 3.0 , 4.0 ]
            [ 5.0 , 6.0 ]
         */
        System.out.println("\n --------- = -----------------\n");
        Matrix.prints(mat.matMulti(a,b));
        /*
            [ 22.0 , 28.0 ]
            [ 49.0 , 64.0 ]
         */
        System.out.println("=================================");


        Matrix.prints(a);
        /*
            [ 1.0 , 2.0 , 3.0 ]
            [ 4.0 , 5.0 , 6.0 ]
         */
        System.out.println("\n --------- X -----------------\n");
        Matrix.prints(c);
        /*
            [ 1.0 , 2.0 , 3.0 ]
            [ 4.0 , 5.0 , 6.0 ]
            [ 7.0 , 8.0 , 9.0 ]
         */
        System.out.println("\n --------- = -----------------\n");
        Matrix.prints(mat.matMulti(a,c));
        /*
            [ 30.0 , 36.0 , 42.0 ]
            [ 66.0 , 81.0 , 96.0 ]
         */
        System.out.println("=================================");


        Matrix.prints(a);
        /*
            [ 1.0 , 2.0 , 3.0 ]
            [ 4.0 , 5.0 , 6.0 ]
         */
        System.out.println("\n --------- X -----------------\n");
        Matrix.prints(d);
        /*
            [ 1.0 , 0.0 , 0.0 ]
            [ 0.0 , 1.0 , 0.0 ]
            [ 0.0 , 0.0 , 1.0 ]
         */
        System.out.println("\n --------- = -----------------\n");
        Matrix.prints(mat.matMulti(a,d));
        /*
            [ 1.0 , 2.0 , 3.0 ]
            [ 4.0 , 5.0 , 6.0 ]
         */
    }
}
