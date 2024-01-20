package array;

public class ArrayDi4 {

    public static void main(String[] args) {
         // 2*3 이차원 배열
        int[][] arr = new int[3][4]; //행 2, 열 3

        int i = 1;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i;
                i++;

            }
        }


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
