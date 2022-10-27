package _27102022.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHasSetEx {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(55);
        set.add(3);
        set.add(4);
        set.add(61);
        set.add(26);
        set.add(46);
        set.add(655);
        set.add(676);

        System.out.println(set);
    }
}
