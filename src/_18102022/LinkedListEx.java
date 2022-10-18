package _18102022;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(44);
        linkedList.add(11);
        linkedList.add(22);
        linkedList.add(33);

        

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(23);
        arrayList.add(231);
        arrayList.add(233);
        arrayList.add(323);

        arrayList.get(0);//O(1)
        linkedList.get(0);//O(n/2)

        System.out.println(linkedList);
    }
}