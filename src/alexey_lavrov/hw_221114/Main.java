package alexey_lavrov.hw_221114;

import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {
        System.out.println(countSameWord("Мама мама мыла раму"));
        System.out.println(countSameWordWithPattern("Мама мама мыла раму"));
    }

    /**
     * TODO
     *  - String s = "Мама мама мыла раму";
     *  Пройтись стримом по тексту и вывести на экран:
     *  Мама: 2
     *  мыла: 1
     *  раму: 1
     */
    private static Map<String, Long> countSameWord(String str) {
        return Arrays.stream(str.split(" ")).collect(groupingBy(String::toLowerCase, Collectors.counting()));
    }
    private static Map<String, Long> countSameWordWithPattern(String str) {
        return Pattern.compile("\\s* \\s*")
                .splitAsStream(("Мама мама мыла раму").trim())
                .collect(groupingBy(String::toLowerCase, Collectors.counting()));
    }
}