package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("숫자를 입력하세요: ");
        int intValue1 = scanner.nextInt();

        System.out.print("숫자를 입력하세요: ");
        int intValue2 = scanner.nextInt();

        if (intValue1 > intValue2) {
            System.out.print("더 큰 숫자는: " + intValue1);
        } else if (intValue1 < intValue2) {
            System.out.print("더 큰 숫자는: " + intValue2);
        } else {
            System.out.print("두 숫자는 같습니다") ;
        }
    }
}
