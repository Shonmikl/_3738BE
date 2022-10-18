package _18102022;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();

        int[] a = new int[10];
        integerList.add(5);
        integerList.add(10);
        integerList.add(2, 55);

        System.out.println(integerList);

//        a[0] = 22;
//        a[2] = 212;
//        System.out.println(Arrays.toString(a));
    }
}