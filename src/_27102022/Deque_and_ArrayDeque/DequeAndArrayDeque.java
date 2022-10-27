package _27102022.Deque_and_ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAndArrayDeque {
    public static void main(String[] args) {
        //Double ended queue == Deque
        //Можем взять и добавить как первый так и последний элемент
        //addFirst === offerFirst
        //addLast === offerLast
        //removeFirst === pollFirst
        //getLast == peekLast
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(9);
        deque.addLast(7);
        deque.offerLast(11);

//        System.out.println(deque);

        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque);
    }
}
