package alexey_lavrov.hw_NY_2023._12;

import java.util.Arrays;
import java.util.LinkedList;

public class HW12 {
    /**
     * TODO: 12 ** Написать метод который принимает стрингу из нескольких слов и возвращает перевернутое предложение. ВОЗВРАЩАЕМОЕ ЗНАЧЕНИЕ STRING!
     *  input -> my name is
     *  out -> is name my
     */
    public static void main(String[] args) {
        System.out.println(revert("my name is"));
    }

    private static String revert(String str ){
        LinkedList<String> stack = new LinkedList<>();
        Arrays.stream(str.split(" ")).forEach(stack::push);
        return String.join(" ", stack);
    }
}
