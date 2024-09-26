package aleksey_babaykin.hw20221108;

import java.util.Arrays;
import java.util.List;

public class Print{
    public static void print(int[] arrayIn) {
        System.out.println(Arrays.toString(arrayIn));
    }
    public static void print(int result){
        System.out.println(result);
    }
    public static void print(double result){
        System.out.println(result);
    }
    public static void print(boolean result){
        System.out.println(result);
    }

    public static <T> void print(List<T> list){
        list.stream().forEach(item -> System.out.print(item.toString() + " | "));
        System.out.println();
    }
    public static <T> void print(T item){
        System.out.println(item.toString() );
    }

}
