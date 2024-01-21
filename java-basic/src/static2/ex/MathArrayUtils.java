package static2.ex;

public class MathArrayUtils {


    private MathArrayUtils() {}
    public static int sum(int[] values) {
        int totalValue = 0;
        for (int value : values) {
            totalValue += value;
        }
        return totalValue;
    }

    public static double average(int[] values) {
//        int totalValue = 0;
//        for (int value : values) {
//            totalValue += value;
//        }
//        return (double) totalValue / values.length;

        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];

        for (int i = 1; i < values.length; i++) {
            if (minValue > values[i]) {
                minValue = values[i];
            }
        }
        return minValue;

    }

    public static int max(int[] values) {

        int maxValue = values[0];

        for (int i = 1; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
            }
        }
        return maxValue;
    }
}
