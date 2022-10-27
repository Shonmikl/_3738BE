package _27102022.list_iterator;

import java.util.LinkedList;
import java.util.List;

public class ListIteratorEx {
    public static void main(String[] args) {
        String example = "super";
        List<Character> list = new LinkedList<>();

        for (char ch : example.toCharArray()) {//[s, u, p, e, r]
            list.add(ch);
        }
        System.out.println(list);
    }
}
