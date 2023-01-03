package HW_2023;

import java.util.Scanner;

public class HW3_StreamUpperLowerCaseLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String ss = sc.next();
        long streamFromString1 = ss.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isUpperCase)
                .count();
        System.out.println("Number of capital letters: " + streamFromString1);
        long streamFromString2 = ss.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLowerCase)
                .count();
        System.out.println("Number of lowercase letters: " + streamFromString2);
    }
}

