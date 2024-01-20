package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {

        // 전위증감 연산자
        int a = 1;
        int b = 0;
        b = ++a; //a값 먼저 증가하고 대입

        System.out.println("a = " + a + ", b = " + b);

        // 전위증감자
        a = 1;
        b = 0;
        b = a++; //a값 먼저 증가하고 대입

        System.out.println("a = " + a + ", b = " + b);

    }
}
