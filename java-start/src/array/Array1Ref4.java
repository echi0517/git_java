package array;

public class Array1Ref4 {

    public static void main(String[] args) {

//        int[] students; // 배열 변수 선언
//        int[] students = new int[]{90, 80, 70, 60, 50}; // 배열생성 과 초기화
        int[] students = {90, 80, 70, 60, 50}; // 배열생성 과 초기화

        // 변수 값 사용

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "의 점수: " + students[i]);
        }

    }
}
