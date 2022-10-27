package _27102022.set;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("Alexey");
//        set.add("Mikhail");
//        set.add("Alexandr");
//        set.add("Alexey");
//        set.add("Alexey");
//        set.add("Yuri");
//        set.add(null);

//        for (String s : set) {
//            System.out.println(s);
//        }
//        System.out.println(set.contains("Yuri"));
//        System.out.println(set.contains("Maxim"));
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        HashSet<Integer> set2 = new HashSet<>();
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(7);

        HashSet<Integer> result = new HashSet<>(set1);
//        result.addAll(set2);
//
//        System.out.println(result);
        result.retainAll(set2);
        System.out.println(result);



    }
}
