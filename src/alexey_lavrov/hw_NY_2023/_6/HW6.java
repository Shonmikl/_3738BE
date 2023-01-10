package alexey_lavrov.hw_NY_2023._6;

import java.util.Arrays;

public class HW6 {
    /**
     * TODO: 6. Дан массив интов - вывести на экран все четные числа
     */
    public static void main(String[] args) {
        printEven(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    private static void printEven(int[] arrayInt) {
        Arrays.stream(arrayInt).filter(value -> value % 2 == 0).forEach(System.out::println);
    }

}
