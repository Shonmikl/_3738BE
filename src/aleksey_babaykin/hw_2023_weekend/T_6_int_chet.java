package aleksey_babaykin.hw_2023_weekend;

import java.util.stream.Stream;

public class T_6_int_chet {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .filter(item -> item % 2 == 0)
                .forEach(System.out::println);
    }
}
