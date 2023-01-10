package HW_2023;

import java.util.*;
import java.util.stream.Collectors;

public class HW9_NumberOfRepetitionsSubstring {
    public static void main(String[] args) {
        System.out.println("Enter string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str.chars()
                .mapToObj(Character::toString)
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()))
                .entrySet()
                .forEach(item -> System.out.print("" + item.getValue() + item.getKey()));

    }
}
