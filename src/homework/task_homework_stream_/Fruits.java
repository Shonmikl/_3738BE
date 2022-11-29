package homework.task_homework_stream_;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fruits {
    public static void main(String[] args) {
        Map<String, String> fruits = Stream.of("apple", "banana", "lemon", "orange")
                .collect(Collectors.toMap(e ->e.substring(0,1), e->e));
        System.out.println(fruits);

    }
}
