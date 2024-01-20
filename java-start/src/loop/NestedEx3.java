package loop;

public class NestedEx3 {

    public static void main(String[] args) {

        int rows = 10;
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= rows - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//    *
//   ***
//  *****
