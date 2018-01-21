package xyz.curuhome.chap127;

public class FactorialUsingRecursive {
    public  int fact(int m){
        int temp=0;
        if(m==1 || m==0) {temp=1;}
        else if(m>1){  temp=m*fact(m-1);  }
        return temp;
    }
    public static void main(String[] args)
    {
        FactorialUsingRecursive fc=new FactorialUsingRecursive();
        for(int i=1; i<10;i++){
            System.out.println(fc.fact(i));
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
