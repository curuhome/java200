package xyz.curuhome.chap082;

import xyz.curuhome.chap081.Account;
public class AccountInstanceMain {
    public static void main(String[] args) {
        //chap 081 - Account
        Account acc1=new Account();                 // 500
        Account acc2=new Account(1000);     // 1000
        Account acc3=new Account(1000);     // 1000

        System.out.println(acc2==acc3);             // false
        System.out.println(acc3.equals(acc3));      // true
    }
}
