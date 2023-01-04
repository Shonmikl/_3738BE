package aleksey_babaykin.hw_2023_weekend;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;
public class T_4_Longest_String {
    public static void main(String[] args) {

        String[] oldString1 = {"we", "wee", "qwer", "oooo"};
        String[] oldString2 = {"we", "iehe","wee", "qwer", "oooo"};
        getLongestStrings(oldString1);
        getLongestStrings(oldString2);

    }
    static void getLongestStrings(String[] inStringArray) {
        System.out.printf("\nStart array Strings: %s \n", Arrays.toString(inStringArray));

        Stream.of(inStringArray)
                .filter(s ->
                        s.length() == Stream.of(inStringArray)
                                .max(Comparator.comparing(String::length))
                                .map(item -> {System.out.println("1234");return item;})
                                .get().length())
                .forEach(System.out::println);
    }
}