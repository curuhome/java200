package xyz.curuhome.chap126;

public class FactorialUsingFor {
    public int fact(int m){
        int temp=1;
        for(int i=m;i>0;i--){
            temp*=i;
        }
        return temp;
    }
    public static void main(String[] args)
    {
        FactorialUsingFor fa = new FactorialUsingFor();
        for(int i=1; i<10; i++){
            System.out.println(fa.fact(i));
        }
        /*
            1
            2
            6
            24
            120
            720
            5040
            40320
            362880
         */
    }
}
