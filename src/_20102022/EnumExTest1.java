package _20102022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnumExTest1 {
//    private static final int MONDAY = 1;
//    static void method(String day) {
//        System.out.println("Today is " + day);
//    }
//    static void method1(int day) {
//        System.out.println("Today is " + day);
//    }

    public static void main(String[] args) {
//        List<Week> weekList = new ArrayList<>();
//        Week d1 = Week.MONDAY;
//        weekList.add(d1);
//        System.out.println(weekList);

        Week w1 = Week.MONDAY;
        Week w2 = Week.TUESDAY;
//        Today today = new Today(w1);
//        today.getDay();
        Week www = Week.MONDAY;
//        System.out.println(w1==www);
        NewWeek newWeek = NewWeek.MONDAY;
//        System.out.println(w1.equals(newWeek));
//        System.out.println(w1.equals(www));

//        Week week = Week.valueOf("MONDAY");//good
//        Week week1 = Week.valueOf("MONDAy");//not good
//        System.out.println(week);
        Week[] weeks = Week.values();
        System.out.println(Arrays.toString(weeks));
    }
}