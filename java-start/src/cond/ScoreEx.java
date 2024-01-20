package cond;

public class ScoreEx {

    public static void main(String[] args) {
        int score = 100;
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (80 <= score && score < 90) {
            grade = "B";
        } else if (70 <= score && score < 80) {
            grade = "C";
        } else if (60 <= score && score < 70) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("학점은 "+ grade + "입니다.");

    }
}
