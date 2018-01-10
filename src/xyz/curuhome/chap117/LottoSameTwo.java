package xyz.curuhome.chap117;

import java.util.Arrays;
public class LottoSameTwo {
    private int n;
    private int[] ball;
    LottoSameTwo(int n){
        setSame(n);
    }
    public void setSame(int n){
        this.n=n;
        ball=new int[n];
        Arrays.fill(ball, -1);
    }
    public int[] getBall(){
        return ball;
    }
    private int isSame(int [] a, int b){
        int isS=0;
        for (int anA : a) {
            if (anA == b) {
                isS++;
            }
        }
        /*
            for(int i=0;i<a.length;i++){
                if(a[i]==b){
                    isS++;
                }
            }
         */
        return isS;
    }
    //원하는 수의 배열 만들기
    public  void make(){
        int count=0;
        while(true){
            // Math.random()  0<=n<1까지 실수
            int b=(int)(Math.random()*(n/2));
            if(isSame(ball,b)<2){
                ball[count++]=b;
            }
            if(count==n){break;}
        }
    }
}
