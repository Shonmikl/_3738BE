package _27102022.set;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new java.util.TreeSet<>();
        set.add(5);
        set.add(51);
        set.add(25);
        set.add(53);
        System.out.println(set);

        Integer a = 5;
        Integer b = 5;

        String s = "W";
        String s1 = "W";

        System.out.println(a == b);
        System.out.println(s == s1);
    }
}
