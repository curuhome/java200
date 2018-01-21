package xyz.curuhome.chap125;

public class GCDUsingRecursiveMain {
    public static void main(String[] args)
    {
        System.out.println(GCDUsingRecursive.gcdR(15,80));
        /*
            ( 15 , 80 )
            ( 15 , 65 )
            ( 15 , 50 )
            ( 15 , 35 )
            ( 15 , 20 )
            ( 15 , 5 )
            ( 10 , 5 )
            ( 5 , 5 )
            5
         */
        System.out.println(GCDUsingRecursive.lcmR(15,80));
        /*
            ( 15 , 80 )
            ( 15 , 65 )
            ( 15 , 50 )
            ( 15 , 35 )
            ( 15 , 20 )
            ( 15 , 5 )
            ( 10 , 5 )
            ( 5 , 5 )
            240
         */
    }
}
