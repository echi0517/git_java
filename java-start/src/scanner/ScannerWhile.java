package scanner;

import java.util.Scanner;

public class ScannerWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자를 입력하세요 (exit: 종료): ");
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.print("종료");
                break;
            }
            System.out.println(str);
        }
    }
}
