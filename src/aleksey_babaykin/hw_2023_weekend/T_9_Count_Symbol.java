package aleksey_babaykin.hw_2023_weekend;

import java.util.stream.Collectors;

public class T_9_Count_Symbol {
    public static void main(String[] args) {
        String s = "AAGGTFFDDVVAA";

        s.chars()
                .map(item -> {
                    if(!(item >= 65 && item <= 90 || item >= 97 && item <= 122 )){
                        try {
                            throw new Exception();
                        } catch (Exception e) {
                            System.out.println("T_9_Exception: ");
                            throw new RuntimeException(e);
                        }
                    }
                    return item;})
                .mapToObj(Character::toString)
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()))
                .entrySet()
                .forEach(item -> System.out.print(""+item.getValue()+item.getKey()));
    }
}
