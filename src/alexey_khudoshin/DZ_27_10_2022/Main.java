package alexey_khudoshin.DZ_27_10_2022;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        ArrayList
        ArrayList<Integer>dayOfMonths = new ArrayList<>(31);
        for (int i = 0; i < 31; i++) {
            dayOfMonths.add(i+1);
            int res = dayOfMonths.get(i);
            System.out.print(" "+res);
        }
//        LinkedList
        enum Week {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }

//        LinkedList<String>dayOfWeek = new LinkedList<>();

        LinkedList<String> dayOfWeek = new LinkedList<>();
        dayOfWeek.add(String.valueOf(Week.values()));
//        dayOfWeek.toString();
        dayOfWeek.forEach(x -> System.out.println(x));
    }


}
