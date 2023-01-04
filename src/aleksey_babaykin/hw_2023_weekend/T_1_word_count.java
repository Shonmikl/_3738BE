package aleksey_babaykin.hw_2023_weekend;

import java.util.Arrays;
import java.util.stream.Collectors;

public class T_1_word_count {
    public static void main(String[] args) {
        String s = "my name is";
        Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()))
                .entrySet()
                .forEach(k -> System.out.println(k.getKey() + " : " + k.getValue()));
    }
}