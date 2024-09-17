package alexey_lavrov.hw_NY_2023._1;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class HW1 {
    /**
     * TODO: 1.**** Создать стрим который принмает на вход Стрингу а на выходе выводит на экран кол-во слов и повторений данного слова:
     * inut-> my name is
     * out -> my : 1
     * name : 1
     * is : 1
     */
    public static void main(String[] args) {
        System.out.println(countSameWord("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."));

    }
    private static Map<String, Long> countSameWord(String str) {
        return Arrays.stream(str.split(" ")).collect(groupingBy(String::toLowerCase, Collectors.counting()));
    }
}
