package HW_2023;

import java.util.stream.IntStream;

public class HW8_7BiggestNumbers {
    public static void main(String[] args) {
        HW6_EvenNumbers inputArr = new HW6_EvenNumbers();
        int[] arr = HW6_EvenNumbers.inputIntArray();
        System.out.println("Source array is");
        IntStream.of(arr).boxed()
                .sorted((o1, o2) -> o2.compareTo(o1))
                .limit(7)
                .forEach(System.out::println);
    }
}