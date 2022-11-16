package aleksey_babaykin.hw20221108;

/*
Дано:
List<String> fruits = Stream.of("apple", "banana", "lemon", "orange")
Надо: преобразовать стрим из строк в мапу, причём ключом сделать первую букву соответствующего слова
На выходе должно быть: {a=apple, b=banana, l=lemon, o=orange}
 */

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2StreamStringToMapKeyFirstSymbol {
    public static void main(String[] args) {
        System.out.println( Stream.of("apple", "banana", "lemon", "orange")
                .collect(Collectors
                        .toMap(item -> item.substring(0,1), item -> item)));
    }
}