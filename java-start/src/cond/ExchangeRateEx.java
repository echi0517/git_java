package cond;

public class ExchangeRateEx {

    public static void main(String[] args) {
        int dollar = 10;
        int rt = 1300;
        int exchage;

        if (dollar < 0) {

            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            exchage = dollar * rt;
            System.out.println("환전할 금액은 " + exchage + "입니다.");
        }

    }
}
