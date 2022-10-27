package _27102022.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alexey");
        arrayList.add("Mikhail");
        arrayList.add("Alexandr Kh");
        arrayList.add("Irina");
        arrayList.add("Yuri");
        arrayList.add("Alexey B");

//        for (String s : arrayList) {
//            System.out.println(s);
//        }


        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (!"Alexandr Kh".equals(iterator.next()))
            iterator.remove();
        }
        System.out.println(arrayList);

    }
}
