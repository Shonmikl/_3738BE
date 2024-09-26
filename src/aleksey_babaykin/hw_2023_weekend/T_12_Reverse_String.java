package aleksey_babaykin.hw_2023_weekend;

import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class T_12_Reverse_String {
    public static void main(String[] args) {
        String s = "There are a lot of snow in the street";

        System.out.println(s);
        System.out.println(getReverseString(s));
    }
    static String getReverseString(String inString){
        return stream(inString.split(" "))
                .sorted(((o1, o2) -> -1))
                .map(item -> item + " ")
                .collect(Collectors.joining());
    }
}