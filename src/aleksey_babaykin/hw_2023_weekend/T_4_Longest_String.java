package aleksey_babaykin.hw_2023_weekend;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class T_4_Longest_String {
    public static void main(String[] args) {

        String[] oldString1 = {"we", "wee", "qwer", "oooo"};
        String[] oldString2 = {"we", "iehe", "wee", "qwer", "oooo"};
        getLongestStrings(oldString1);
        getLongestStrings(oldString2);

    }
    static void getLongestStrings(String[] inStringArray) {
        System.out.printf("\nStart array Strings: %s \n", Arrays.toString(inStringArray));

        Stream.of(inStringArray)
                .filter(s ->
                        s.length() == Stream.of(inStringArray)
                                .max(Comparator.comparing(String::length))
                                .get().length())
                .forEach(System.out::println);
    }
}

//  -------- Реализация моя ( с показанием ого, что вызов обсчета максимальной длинны, происходит при каждой обработке фильтра
//        Stream.of(inStringArray)
//                .filter(s ->
//                        s.length() == Stream.of(inStringArray)
//                                .max(Comparator.comparing(String::length))
//                                .map(item -> {System.out.println("1234");return item;})
//                                .get().length())
//                .forEach(System.out::println);

//   ---------     Нужно мое делать в 2-а потока ( это решение со стека)
//        int longest = list.stream()
//                .mapToInt(String::length)
//                .max()
//                .orElse(-1);
//
//        List<String> result = list.stream()
//                .filter(s -> s.length() == longest)
//                .collect(toList());

/// ---------   Реализация Алексея Лаврова...
//        String[] stringArray = {null};
//
//        System.out.println( Stream.of(inStringArray)
//                .sorted((o1, o2) -> o2.length() - o1.length())
//                .reduce("",(result, item) -> {
//                    if(stringArray[0] == null){
//                        stringArray[0] = item;
//                        result = item;
//                    }else{
//                        if (stringArray[0].length() == item.length()){
//                            result = result + ", " +item;
//                        }
//                    }
//                    return result;
//                })
//        );