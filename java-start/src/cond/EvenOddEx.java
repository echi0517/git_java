package cond;

public class EvenOddEx {

    public static void main(String[] args) {
        int x = 18;
        int mod = x % 2;
        String state = mod == 1 ? "홀수" : "짝수";
        System.out.println("x = " + x +", " + state);

    }
}
