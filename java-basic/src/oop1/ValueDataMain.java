package oop1;

public class ValueDataMain {

    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        up(valueData);
        up(valueData);
        up(valueData);

        System.out.println("최종 숫자=" + valueData.value);

    }

    static void up(ValueData data) {
        data.value++;
        System.out.println("숫자 증가 value = "+ data.value);
    }
}
