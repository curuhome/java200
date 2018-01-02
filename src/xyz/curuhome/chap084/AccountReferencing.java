package xyz.curuhome.chap084;

import xyz.curuhome.chap081.Account;
public class AccountReferencing {
    public static void main(String[] args) {
        Account acc1=new Account(1000);             // 계좌 생성
        Account acc2=new Account(1000);             // 계좌 생성
        System.out.println(acc1.hashCode());                // 10진수
        /* 1163157884 */

        System.out.println(acc1); //money=10000
//        System.out.println(acc1.toString());
        /* xyz.curuhome.chap081.Account@4554617c */

        System.out.println(acc2); //money=10000              //type@hashCode
        /* xyz.curuhome.chap081.Account@74a14482 */

        acc1.deposit(3000); //money=3000+10000=4000 // 입급
        System.out.println(acc1);
        /* xyz.curuhome.chap081.Account@4554617c */
    }
}
