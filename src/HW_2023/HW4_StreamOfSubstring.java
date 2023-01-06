package HW_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

public class HW4_StreamOfSubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter substrings:");
        String str = sc.nextLine();
        if (str == null || str.length() == 0) {
            System.out.println("Empty string");
        } else {
            String[] substrings = str.split(" ");
            System.out.print(Arrays.toString(substrings) + " ");
            System.out.println();
            List<String> list = new ArrayList<>(List.of(substrings));
            int longest = list.stream()
                    .mapToInt(String::length)
                    .max()
                    .orElse(-1);

            List<String> result = list.stream()
                    .filter(s -> s.length() == longest)
                    .collect(toList());
            System.out.println(Arrays.toString(result.toArray()));
        }
    }
}
