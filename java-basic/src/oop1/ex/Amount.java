package oop1.ex;

public class Amount {

    int balance = 0;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance -= amount;
    }

    void showBalance() {
        System.out.println("현재 잔액: " + balance);
    }
}
