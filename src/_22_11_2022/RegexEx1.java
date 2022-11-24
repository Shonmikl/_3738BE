package _22_11_2022;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {
    public static void main(String[] args) {
        String s =
                "Line the base of a 1.5 litre/22 pint ovenproof dish or " +
                        "baking tray with a single layer of tortilla chips, " +
                        "then top with half of the beef mixture, then half the " +
                        "cheddar and half the cherry tomatoes. Add a second layer of " +
                        "tortilla chips, then top with the remaining beef and cheese. " +
                        "Transfer to the oven and cook for 8–10 mins, until the cheese has " +
                        "melted. +12 34567, ghhh@gmail.com, gh654hh@yahoo.ru";

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(com|ru)");
//        Pattern pattern = Pattern.compile("\\+\\d{2}");
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");
//        Pattern pattern = Pattern.compile("\\d{2}");
//        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
