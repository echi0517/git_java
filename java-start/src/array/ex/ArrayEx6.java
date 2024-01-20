package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int num = scanner.nextInt();

        int[] arr = new int[num];

        int maxValue = 0;
        int minValue = 0;
        System.out.println(num+"개의 정수를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

        }


        maxValue = minValue = arr[0];

        for (int i = 1; i < num; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }


        System.out.println("가장 작은 정수: " + minValue);
        System.out.println("가장 큰 정수: " + maxValue);




    }
}
