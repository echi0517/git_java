package scanner;

import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("숫자를 입력하세요: ");
        int intValue1 = scanner.nextInt();

        System.out.print("숫자를 입력하세요: ");
        int intValue2 = scanner.nextInt();

        int sum = intValue1 + intValue2;
        System.out.println("두 숫자의 합: "+sum);
    }



}


