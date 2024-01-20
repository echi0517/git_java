package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째,두번째 숫자를 0 입력하면 종료합니다.");
        while (true) {

            System.out.print("첫번째 숫자를 입력하세요: ");
            int intValue1 = scanner.nextInt();

            System.out.print("두번쨰 숫자를 입력하세요: ");
            int intValue2 = scanner.nextInt();


            if (intValue1 == 0 && intValue2 == 0) {
                System.out.print("종료");
                break;
            }
            int sum = intValue1 + intValue2;
            System.out.println("두 수의 합계는 :" + sum);
        }
    }
}
