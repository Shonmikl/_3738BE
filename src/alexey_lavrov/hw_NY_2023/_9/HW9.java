package alexey_lavrov.hw_NY_2023._9;

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class HW9 {
    /**
     * TODO: 9*. Дано String s = "AAGGTFFDDVVAA" или похожая.
     * Вывести на экран кол-во повторений в таком виде
     * "4A2G1T2F2D2V"
     * **Если в стринге есть какие то другое символы кроме букв - выбросить исключение
     */
    public static void main(String[] args) {
        System.out.println(getSymbolCount("AAGGTFFDDVVAA"));
    }

    private static String getSymbolCount(String str) {
        if (str == null || !str.matches("[a-zA-Z]*")) {
            throw new RuntimeException("Wrong Symbols");
        }
        return Arrays.stream(str.split(""))
                .collect(groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream().map(e -> e.getValue() + e.getKey())
                .collect(Collectors.joining(""));
    }
}