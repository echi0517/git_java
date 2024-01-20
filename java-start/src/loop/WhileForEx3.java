package loop;

public class WhileForEx3 {
    public static void main(String[] args) {
        int max = 100;
        int i = 1;
        int sum = 0;

        while (i <= max) {
            sum += i;
            System.out.println(sum);
            i++;
        }

        System.out.println();

        int sum2 = 0;
        for (int i2 = 1; i2 <= max; i2++) {
            sum2 += i2;
            System.out.println(sum2);
        }

    }
}
