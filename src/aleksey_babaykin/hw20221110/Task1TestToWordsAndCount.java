package aleksey_babaykin.hw20221110;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
- String s = "Мама мама мыла раму";
Пройтись стримом по тексту и вывести на экран:
Мама: 2
мыла: 1
раму: 1
 */

public class Task1TestToWordsAndCount {
    public static void main(String[] args) {
        String s = "Mother mother washing window Aaa aAa AAA aaA" ;

        Stream.of(s.split(" "))
                .collect(Collectors.toMap(sItem1 -> sItem1, sItem2 -> new NewString(sItem2)))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.groupingBy(value -> value, Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
    }
}