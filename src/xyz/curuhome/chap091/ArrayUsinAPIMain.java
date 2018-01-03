package xyz.curuhome.chap091;

import java.util.Arrays;
public class ArrayUsinAPIMain {
    public static void main(String[] args) {

        int[] a = {5,4,7,1,9,12,0,3,2,6};
        int[] b = new int[a.length];
        int[] c = {5,4,7,1,9,12,0,3,2,6};
        int[] d;

        ArrayNotUsinAPI.arrarycopy(a,b);
        System.out.println(ArrayNotUsinAPI.equals(a,b));
        /* true */

        ArrayNotUsinAPI.fill(b,-6);
        ArrayNotUsinAPI.sort(a);
        ArrayNotUsinAPI.prints(a); //배열 a 출력
        /* [ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 9 , 12 ] */

        System.arraycopy(a,0,b,0,a.length);
        d = c.clone();
        System.out.println(Arrays.equals(d,c));
        /* true */

        Arrays.fill(a,-5);
        Arrays.sort(c);
        ArrayNotUsinAPI.prints(c); //배열 c 출력
        /* [ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 9 , 12 ] */
    }
}
