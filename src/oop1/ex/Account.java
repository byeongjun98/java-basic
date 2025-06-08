package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("입금 완료. 잔액은: " + balance);
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("출금 실패. 잔액 부족");
        }else {
            balance -= amount;
            System.out.println("출금 완료. 잔액은: " + balance);
        }
    }

    void showBalance() {
        System.out.println("잔액은: " + balance);
    }

}
