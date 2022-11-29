package homework.task_homework_stream_;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperatingSystem {
    public static void main(String[] args) {
        String stream = Stream.of("Linux","Windows","Mac")
                .collect(Collectors.joining(","));
        System.out.println(stream);
    }
}
