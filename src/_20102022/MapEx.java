package _20102022;

import java.io.File;
import java.util.*;

public class MapEx {
    //сколько угодно викав
    List<Week> weekList = new ArrayList<>();
    //сколько угодно стрингов
    List<String> stringList = new LinkedList<>();
    //одна стринга
    String a = "UUU";
    //ограниченное кол-во стрингов
    String[] f = {"ff", "tt"};
    List<NewWeek> newWeeks = new ArrayList<>();

    List<File> files = new LinkedList<>();
    List<Scanner> scanners = new ArrayList<>();
    List<IllegalArgumentException> exceptions = new ArrayList<>();

    Today ttt = new Today(Week.SATURDAY);
    public static void main(String[] args) {
        Map<Week, String> map = new TreeMap<>();
        Map<Integer, String> stringMap = new Hashtable<>();
        Map<String, IllegalArgumentException> illegalArgumentExceptionMap = new HashMap<>();

        Map<Integer, String> dictionary = new HashMap<>();

        dictionary.put(1, "IRINA");
        dictionary.put(5, "Mikhail");
        dictionary.put(11, "Yuri");

        dictionary.get(1);

        map.put(Week.MONDAY, "Monday");
        map.put(Week.TUESDAY, "Tuesday");


    }
}