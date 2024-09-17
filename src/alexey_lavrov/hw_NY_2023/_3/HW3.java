package alexey_lavrov.hw_NY_2023._3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HW3 {
    /**
     * TODO: 3**. Дана стринга  String ss = "KikJhYggfTgf" ( это пример )
     * вывести на экран кол-во букв в верхнем и нижнем регистре используя СТРИМЫ
     */
    public static void main(String[] args) {
        System.out.println(charCount("KikJhYggfTgf"));
    }

    private static Map<Object, Long> charCount(String str) {
        Map<String, String> groupToRegex = new HashMap<>();
        groupToRegex.put("UpperCase", "[A-Z]");
        groupToRegex.put("DownCase", "[a-z]");

        RegexBasedGroupingFunction<String> f = new RegexBasedGroupingFunction<>(groupToRegex);

        return Arrays.stream(
                str.split("")).collect(
                Collectors.groupingBy(f, Collectors.counting()));
    }

}
