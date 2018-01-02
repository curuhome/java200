package xyz.curuhome.chap081;

public class AccountsMain {
    public static void main( String[] args)
    {
        Account acc1 = new Account(1000); // 계좌 생성  500 => 1000
        acc1.deposit(3000);              // 저축       3000+1000=4000
        acc1.deposit(2000);              // 저축       4000+2000=6000
        acc1.withdraw(500);              // 출금       500 && 6000-500 => 6000-500=5500
        System.out.println(acc1.getMoney());      // 현재 잔금  5500
    }
}
