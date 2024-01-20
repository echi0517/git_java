package oop1.ex;

public class AmountMain {

    public static void main(String[] args) {
        Amount amount = new Amount();

        amount.deposit(10000);
        amount.withdraw(9000);
        amount.withdraw(2000);
        amount.showBalance();
    }
}
