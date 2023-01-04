package aleksey_babaykin.hw_2023_weekend;

import java.util.Comparator;
import java.util.stream.Stream;

public class T_4_Longest_String {
    public static void main(String[] args) {

        String[] oldString = {"we", "wee", "qwer", "oooo"};

        Stream.of(oldString)
                .filter(s ->
                        s.length() == Stream.of(oldString)
                                .max(Comparator.comparing(String::length))
                                .get().length())
                .forEach(System.out::println);
    }
}
