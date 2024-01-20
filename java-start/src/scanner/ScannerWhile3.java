package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("0 입력하면 종료합니다.");
        int sum = 0;
        while (true) {

            System.out.print("숫자를 입력하세요: ");
            int intValue1 = scanner.nextInt();

            if (intValue1 == 0) {
                System.out.print("종료");
                break;
            }
            sum += intValue1;
        }
        System.out.println("합계는 :" + sum);
    }
}
