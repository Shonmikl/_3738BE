package aleksanderSapunovHW.hW_15112022;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class СounterStringName {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Мама", "Мыла", "мама", "МЫЛа","мыла", "Папу", "ПАПУ",
                "МылА", "мЫлА", "ПАПУ", "мАМа", "пАпУ");

        Map<String, Integer> result = list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));

        result.forEach((k, v) -> System.out.print(k + ": " + v + "!  "));

        String s = "Мама соседА Раму мама РАМУ Соседа РАМу СОСЕда Папа ПАПА СоседА Соседа ПАПА мАМа пАпА";

        System.out.println();

        Stream.of(s.split(" "))
                .map(String::toUpperCase)
                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum))
                .forEach((k, v) -> System.out.print(k + ": " + v + "!  "));
    }
}