package HW_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HW5_StringsAlphabetOrder {
    public static String[] arraySubstring() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        String[] substrings = new String[0];
        if (str == null || str.length() == 0) {
            System.out.println("String is empty. Goodbye!");
        } else {
            System.out.println("Array substrings is:");
            substrings = str.split(" ");
            System.out.println(Arrays.toString(substrings));
        }
        return substrings;
    }

    public static void main(String[] args) {
        String[] substrings = arraySubstring();
        List<String> list = new ArrayList<>(List.of(substrings)).stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Alphabet order:");
        System.out.println(Arrays.toString(list.toArray()));
        List<String> list2 = new ArrayList<>(List.of(substrings)).stream()
                .sorted((o1,o2) -> -o1.compareTo(o2))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Alphabet reverse order:");
        System.out.println(Arrays.toString(list2.toArray()));

    }
}
