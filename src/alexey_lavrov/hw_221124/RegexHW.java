package alexey_lavrov.hw_221124;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;

public class RegexHW {


    /**
     * todo:
     *  s -> asdjklsdfkjhasd;lsdfh
     *  [A2D3F1J2]
     *  ЕСЛИ В СТРИНГЕ БУДЕТ ВСЕ ЧТО УГОДНО КРОМЕ БУКАВ, ТО НЕ ПРИНИМАТЬ ТАКУЮ СТРОКУ
     */
    private static String getCharCount(String s) {
        if (!Pattern.matches("[A-z]*", s)) {
            return "String \"" + s + "\" contains No letters";
        }
        return s.chars()
                .mapToObj(c -> (char) c)
                .collect(groupingBy(character -> character, Collectors.counting()))
                .entrySet()
                .stream()
                .map(entry -> entry.getKey().toString().toUpperCase() + entry.getValue())
                .collect(Collectors.joining());
    }

    static void checkIp(String ip) {
        //            [01]?[0-9][0-9]? - 0...199  |||  2[0-4][0-9]  - 200...249  ||| 25[0-5] - 250...255
        String regex = "(([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])";
        System.out.println(ip + " is OK :" + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        String[] ips = new String[]{"255.255.255.255", "125.0.0.9", "128.125.0.7", "128.258.255.200", "128.355.255.200"};
        for (String ip : ips) {
            checkIp(ip);
        }
        System.out.println(getCharCount("asdjklsdfkjhasdlsdl;llllfh"));
        System.out.println(getCharCount("asdjklsdfkjhasdlsdlllllfh"));
    }
}