package HW_2023;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HW1_StreamCountsNumberWords {

    public static String inputString() {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = input.nextLine();
        System.out.println("Control input String: " + str);
        return str;
    }

    public static String[] splitIntoSubstrings() {
        String str = inputString();
        System.out.println("the string is split into substrings:");
        String[] words = str.split(" ");
        //        checking the split of a string into individual words
        for (String word : words) {
            System.out.println(word);
        }
        return words;
    }

    public static class wordCountInLines {
        public static void main(String[] args) {
            String str = inputString();
            Arrays.stream(str.split(" "))
                    .collect(Collectors.groupingBy(item -> item, Collectors.counting()))
                    .entrySet()
                    .forEach(k -> System.out.println(k.getKey() + " : " + k.getValue()));
        }
    }
}