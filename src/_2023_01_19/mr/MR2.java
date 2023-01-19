package _2023_01_19.mr;

import java.util.Arrays;
import java.util.List;

public class MR2 {
    public static void main(String[] args) {
        List<String> list
                = Arrays.asList("Alexey B", "Alexey L", "Aleksey Kh", "Mikhail");
//        for (String s : list) {
//            System.out.println(s);
//        }

//        list.forEach(el-> System.out.println(el));

        list.forEach(System.out::println);
    }
}
