package alexey_lavrov.hw_NY_2023._5;

import java.util.Arrays;
import java.util.Comparator;

public class HW5 {
    /**
     * TODO: 5. Отсортировать строки в алфавитном порядке СТРИМОМ и в обратном
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortStringsDESC(new String[]{"ae", "axe", "qwer", "oooo"})));
        System.out.println(Arrays.toString(sortStrings(new String[]{"ae", "ax", "qwer", "oooo"})));

    }
    private static String[] sortStringsDESC(String[] strings) {
        return Arrays
                .stream(strings)
                .sorted(Comparator.reverseOrder())
                .toArray(String[]::new);

    }

    private static String[] sortStrings(String[] strings) {
        return Arrays
                .stream(strings)
                .sorted(String::compareTo)
                .toArray(String[]::new);

    }

}
