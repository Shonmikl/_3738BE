package alexey_lavrov.hw_NY_2023._4;

import java.util.Arrays;

public class HW4 {
    /**
     * TODO: 4*. Дан стрим  Stream stream = Stream.of("we", "wee", "qwer", "oooo");
     * ( или любой другой…не суть )
     * Вывести на экран СТРИМОМ самую длинную строку. Если несколько одинаковых, то значит несколько.
     */
    public static void main(String[] args) {
        System.out.println(getLongestStrings(new String[]{"we", "wee", "qwer", "oooo"}));
    }

    private static String getLongestStrings(String[] strings) {
        final String[] first = {""};
        return Arrays
                .stream(strings)
                .sorted((o1, o2) -> o2.length() - o1.length())
                .reduce(first[0], (res, el) -> {
                    if (first[0].equals("")) {
                        first[0] = el;
                        res = el;
                    } else if (el.length() == first[0].length()) {
                        res = res + ", " + el;
                    }

                    return res;
                });

    }

}
