package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long amount = 0;

        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("-----------------------------------------");



            System.out.print("선택: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("입금액을 입력하세요: ");
                long deposit = scanner.nextInt();
                amount = deposit(amount, deposit);

            } else if (choice == 2) {
                System.out.print("출금액을 입력하세요: ");
                long withdraw = scanner.nextInt();
                amount = withdraw(amount, withdraw);

            } else if (choice == 3) {
                checkAmount(amount);
            } else if (choice == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 번호입니다.");
            }


        }




    }
    public static long deposit(long  amount , long deposit) {
        amount += deposit;
        System.out.println(deposit+"원을 입금하였습니다. 현재잔액: " + amount);
        return amount;
    }

    public static long withdraw(long  amount , long withdraw) {

        if (amount < withdraw) {
            System.out.println(withdraw+"월을 출금하려 했으나 잔액이 부족합니다.");
            return amount;
        }

        amount -= withdraw;
        System.out.println(withdraw+"원을 출금하였습니다. 현재잔액: " + amount);
        return amount;
    }

    public static void checkAmount(long amount){
        System.out.println("현재 잔액: " + amount + "원");
    }

}
