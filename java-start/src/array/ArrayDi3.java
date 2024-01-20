package array;

public class ArrayDi3 {

    public static void main(String[] args) {
         // 2*3 이차원 배열
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; //행 2, 열 3

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+ " ");

            }
            System.out.println();

        }



//        System.out.println();
//
//        System.out.print(arr[1][0]+ " ");
//        System.out.print(arr[1][1]+ " ");
//        System.out.print(arr[1][2]+ " ");
    }

}
