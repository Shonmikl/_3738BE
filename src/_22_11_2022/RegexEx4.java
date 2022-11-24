package _22_11_2022;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx4 {
    public static void main(String[] args) {
        String card =
                "12366541145887982210658," +
                "36985687452112541212258," +
                "98566325541225870402588";
          //9856 6325 5412 2587 04/02 588
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(card);

        String cardString = matcher.replaceAll("$1 $2 $3 $4 $5/$6 ($7)");
        System.out.println(cardString);
    }
}