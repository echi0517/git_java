package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};
        Scanner scanner = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요:");

            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(subjects[col]+" 점수:");
                arr[row][col] = scanner.nextInt();
            }

        }

        for (int row = 0; row < arr.length; row++) {
            int total = 0;
            double avg = 0;

            for (int col = 0; col < arr[row].length; col++) {
                total += arr[row][col];
            }
            avg = (double) total / arr[row].length;
            System.out.println((row + 1) + "번 학생의 총점: " + total + ", 평균 :" + avg);
        }

    }
}
