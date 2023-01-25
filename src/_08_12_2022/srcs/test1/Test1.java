package _08_12_2022.srcs.test1;

public class Test1 {
    public double get(double[] arr) {
        double half = getHalfSum(arr);
        return half / arr[arr.length - 1];
    }

    private double getHalfSum(double[] arr) {
        int a = 0;
        for (double i = 0; i < arr.length / 2; i++) {
            a = (int) (a + arr[(int) i]);
        }
        return a;
    }
}
