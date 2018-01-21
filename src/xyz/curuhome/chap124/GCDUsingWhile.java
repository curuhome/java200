package xyz.curuhome.chap124;

public class GCDUsingWhile {
    //최대 공약수 값
    public int gcd(int m,int n){
        while(m != n){
            if(m>n)m-=n;
            else if(n>m)n-=m;
        }
        return m;
    }
    //최소 공배수 값
    public  int lcm(int m,int n){
        return (m*n)/gcd(m,n);
    }
}
