package aleksey_babaykin.hw_2023_weekend;

import java.util.stream.Collectors;

public class T_3_Symbol_number {
    public static void main(String[] args) {
        String ss = "AZKikJhYggfTgf";

        ss.chars()
                .map(item -> (item >= 65 && item <= 90) ? 'A' : 'Z')
                .mapToObj(Character::toString)
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()))
                .entrySet()
                .forEach(k -> System.out.println(("A".equals(k.getKey()) ? "Small" : "Capital")  + " : " + k.getValue()));
    }
}