package aleksey_babaykin.hw_2023_weekend;

import java.util.Arrays;
import java.util.Comparator;
public class T_5_Sort_Strings {
    public static void main(String[] args) {
        String s = "we wee qwer oooo";
        naturalOrder(s);
        reverseOrder(s);
    }
    public static void naturalOrder(String s) {
        System.out.println("\n Natural order : ");
        Arrays.stream(s.split(" "))
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
    public static void reverseOrder(String s) {
        System.out.println("\n Reverse order : ");
        Arrays.stream(s.split(" "))
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}