package aleksey_babaykin.hw20221122;

import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * s -> asdjklsdfkjhasd;lsdfh
 * [A2D3F1J2]
 * ЕСЛИ В СТРИНГЕ БУДЕТ ВСЕ ЧТО УГОДНО КРОМЕ БУКАВ, ТО НЕ ПРИНИМАТЬ ТАКУЮ СТРОКУ
 */

public class Task2StringSymboleNumber {
    String st1 = "asdjklsdf kjhasdlsdfh";
    String st2 = "asdjklsdfkjhasdlsdfh";
    void getCharCount(String s) {
        s.toLowerCase().codePoints()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()))
                .forEach((key, value) -> System.out.print(MessageFormat.format("{0}{1}", key, value)));
        System.out.println();
    }
    public boolean isWorkingWithString(String st){
        Pattern pattern = Pattern.compile("[^\\w]");
        Matcher matcher = pattern.matcher(st);
        boolean isOnlyChars = !matcher.find();

        System.out.println("Is Only Chars: " + isOnlyChars + " -> " + st );

        return isOnlyChars;
    }

    public static void main(String[] args) {
        Task2StringSymboleNumber task2StringSymboleNumber = new Task2StringSymboleNumber();
        if(task2StringSymboleNumber.isWorkingWithString(task2StringSymboleNumber.st1))
            task2StringSymboleNumber.getCharCount(task2StringSymboleNumber.st1);

        task2StringSymboleNumber = new Task2StringSymboleNumber();
        if(task2StringSymboleNumber.isWorkingWithString(task2StringSymboleNumber.st2))
            task2StringSymboleNumber.getCharCount(task2StringSymboleNumber.st2);
    }
}