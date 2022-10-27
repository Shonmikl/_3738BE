package _27102022.list_iterator;

import _25102022.compare.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class ListIteratorEx {
    public static void main(String[] args) {
        String example = "super";
        List<Character> list = new LinkedList<>();

        for (char ch : example.toCharArray()) {//[s, u, p, e, r]
            list.add(ch);
        }
        // System.out.println(list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;

        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {

                isPalindrome = false;
                System.out.println("[" + example + "]" + " isn't palindrome");
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("[" + example + "]" + " is palindrome");
        }
    }
}
