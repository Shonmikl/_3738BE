package _10112022;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

//        List<?> list4 = new ArrayList<String>();
//        list4.add("PPP");

        List<? extends Number> list5 = new ArrayList<Float>();
        List<? super Number> list6 = new ArrayList<Number>();



        List<?> list = new ArrayList<Integer>();
        List<Double> list1 = new ArrayList<>();
        list1.add(3.1);
        list1.add(32.31);
        list1.add(31.21);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("WWW");
        list2.add("QQQ");
        list2.add("EEE");
        showListInfo(list2);
    }

    private static void showListInfo(List<?> list1) {
        System.out.println(list1);
    }

//    public static double sum(ArrayList<? extends Number> arrayList) {
//        double sum = 0;
//        for (Number n : arrayList) {
//            sum = sum + n;
//        }
//    }


}
