import java.util.Scanner;

public class Back {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
        

    }
}
