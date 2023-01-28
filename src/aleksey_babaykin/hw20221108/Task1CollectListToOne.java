package aleksey_babaykin.hw20221108;

/*
Дано: Stream.of("Linux", "Windows", "Mac")
Надо: Объединение нескольких строк в одну
*/

import java.util.stream.Stream;

public class Task1CollectListToOne {
    public static void main(String[] args) {
        System.out.println(Stream.of("Linux", "Windows", "Mac")
                .reduce((left, right) ->  left + right)
                .get());
    }
}