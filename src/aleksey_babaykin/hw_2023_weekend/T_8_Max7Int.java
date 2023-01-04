package aleksey_babaykin.hw_2023_weekend;

import java.util.Arrays;
import java.util.Comparator;

public class T_8_Max7Int {
    static int[] arrayMain = {100, 58, 8, 0, -100, -13, 7, 15, 4, 6, 8, 3, 5, 22, 14, 7};

    public static void main(String[] args) {
        get7MaxItems(arrayMain);
    }
    static void get7MaxItems(int[] array){
        Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(7)
                .forEach(System.out::println);
    }
}
