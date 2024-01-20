package method.ex;
public class MethodEx1Ref {

    public static void main(String[] args) {

        int sum = add(1, 2, 3);
        double average = avg(sum);
        System.out.println("평균값: " + average);

        sum = add(15, 25, 35);
        average = avg(sum);
        System.out.println("평균값: " + average);

    }

    public static int add (int a, int b, int c) {
        return a + b + c;
    }
    public static double avg (double sum) {
        return sum / 3.0;
    }
}