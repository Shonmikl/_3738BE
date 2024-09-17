package alexey_lavrov.hw_NY_2023._8;

import java.util.Arrays;

public class HW8 {
    /**
     * TODO: 8. Вывести 7  самых больших числе из массива чисел СТРИМОМ
     */
    public static void main(String[] args) {
        printSevenNumbers(new Integer[]{5, 8, 9, 2, 5, 7, 10, 55, 12, 45,});
    }

    private static void printSevenNumbers(Integer[] arrayInt) {
        Arrays.stream(arrayInt).sorted((o1, o2) -> Integer.compare(o2, o1)).limit(7).forEach(System.out::println);
    }
}