package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPrice = 0;
        while (true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();
            scanner.nextLine();

            String name = "";
            int price = 0;
            int quantity = 0;
            if (option == 1) {

                System.out.print("상품명을 입력하세요: ");
                name = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                quantity = scanner.nextInt();

                int subTotal = price * quantity;

                System.out.println("상품명:" + name + " 가격:" + price + " 수량:" + quantity + " 합계:" + subTotal);

                totalPrice += subTotal;
            } else if (option == 2) {
                System.out.println("총 비용: " + totalPrice);
                totalPrice = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

    }
}

