package array;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};


        // 일반 for 문
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //향상된 for 문, for-each문

        for (int i : arr) {
            System.out.println(i);
        }

        //for-each 문을 사용할 수 없는 경우, 증가하는 index 값 필요
        for (int i = 0; i < arr.length; i++) {
            System.out.println("number"+i+"번의 결과는: "+ arr[i]);
        }

    }
}
