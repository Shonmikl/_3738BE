package _20102022;

import java.util.ArrayList;
import java.util.List;

public class EnumExTest1 {
    private static final int MONDAY = 1;
    static void method(String day) {
        System.out.println("Today is " + day);
    }
    static void method1(int day) {
        System.out.println("Today is " + day);
    }

    public static void main(String[] args) {
        List<Week> weekList = new ArrayList<>();
        Week d1 = Week.MONDAY;
        weekList.add(d1);
        System.out.println(weekList);

    }
}
