package alexey_lavrov.hw_NY_2023._13;

import java.util.Arrays;
import java.util.LinkedList;

public class HW13 {
    /**
     * TODO: 13**Написать метод
     * input -> int a =221
     * out -> 122
     * input -> int b = -123
     * out -> -321
     * !!JПомните по диапазон интов!!
     */
    public static void main(String[] args) {
        System.out.println(reverseInt(12345));
        System.out.println(reverseInt(-Integer.MAX_VALUE));

    }

    private static Long reverseInt(Integer number) {
        int sign = number < 0 ? -1 : 1;
        LinkedList<String> stack = new LinkedList<>();
        Arrays.stream(number.toString().split("")).filter(s -> s.matches("[0-9]")).forEach(stack::push);

        return Long.parseLong(String.join("", stack)) * sign;
    }
}