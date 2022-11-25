package _22_11_2022;

import java.util.regex.*;

public class RegexEx2 {
    public static void main(String[] args) {
        //String text;
        //Pattern pattern = Pattern.compile( regex );
        //Matcher matcher = pattern.matcher( text );

//        String s1 = "ABCD ABCE ABCDEFABCDFFEDTABCD";
//        Pattern pattern = Pattern.compile("ABCD");
//        String s1 = "OPABMNCD";
//        Pattern pattern = Pattern.compile("[ABC]");
//        String s1 = "ABDOP";
//        Pattern pattern = Pattern.compile("AB[C-F]OP");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern = Pattern.compile("abc[e-g4-7]");
//        Pattern pattern = Pattern.compile("abc[^e-g4-7]");
//        Pattern pattern = Pattern.compile("abc(e|5)");
//        Pattern pattern = Pattern.compile("abc.");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern = Pattern.compile("^abc");
//        Pattern pattern = Pattern.compile("h$");
//        Pattern pattern = Pattern.compile("[0-9]");
//        Pattern pattern = Pattern.compile("abc[^e-g4-7]");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern = Pattern.compile("\\d");
//        Pattern pattern = Pattern.compile("\\D");
//        Pattern pattern = Pattern.compile("\\w");
//        Pattern pattern = Pattern.compile("\\w+");
//        Pattern pattern = Pattern.compile("\\W+");
//        String s1 = "abcd   abce  abc59abcg6abch";
//        Pattern pattern = Pattern.compile("\\D{2,5}");
//        Pattern pattern = Pattern.compile("\\W+");
//        Pattern pattern = Pattern.compile("\\w{4}");
//        System.out.println("AA \" BB");
//        String s1 = "ABBABCABABABABDACBDA";
        String s1 = "abcd   abce  abc59abcg6abch";
        Pattern pattern = Pattern.compile("[abcd][ahbdcf6]");
//        Pattern pattern = Pattern.compile("abch\\Z");
//        Pattern pattern = Pattern.compile("C(AB)*");
//        Pattern pattern = Pattern.compile("C(AB)?");
//        Pattern pattern = Pattern.compile("C(AB){2,3}");
        Matcher matcher = pattern.matcher(s1);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " : " + matcher.group());
        }
    }
}
