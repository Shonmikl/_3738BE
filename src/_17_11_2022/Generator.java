package _17_11_2022;

import lombok.experimental.UtilityClass;

import java.util.*;

@UtilityClass
public class Generator {
    List<String> list = new LinkedList<>();
    Set<String> set = new HashSet<>();

    public void addToSetAndList(String s) {
        list.add(s);
        set.add(s);
    }

    public static void main(String[] args) {
        char a = 'A';
        a++;
        System.out.println(a);
    }
}