package xyz.curuhome.chap081;

public class Account {
    private double money=500;        // 명시적 초기
    public Account ( double money ){ // 생성자에 의한 초기
        this.money = money;
    }
    public Account(){                // default 생성자에 의한 초기화
    }
    public double getMoney(){        // 현재 잔금
        return money;
    }
    // 음수 돈, 잔금보다 많은 돈을 출금금지
    public void withdraw(double amount){  //출금
        if((amount>0)&&(money-amount>=0)){
            money-=amount;
        }
    }
    // 음수 돈, 입금 금지
    public void deposit(double amount){  //입금
        if(amount>0){
            money+=amount;
        }
    }
}
