package aleksey_babaykin.hw20221108;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayHW {
    
    public static void main(String[] args) {
        
        ArrayHW arrayHW = new ArrayHW();
        int[] array = new int[]{5, 2, 4, 6, 7, 8, 5, 7, 9, 2, 3, 8, 7, 5, 2, 8, 5, 7, 2, 3};

        System.out.println("Array filter: ");
        Print.print(Arrays
                .stream(array)
                .filter(value -> value == 5)
                .toArray());

        System.out.println("Array - forEach: ");
        Arrays
                .stream(array)
                .forEach(item -> System.out.print(item + " | "));
        System.out.println();

        System.out.println("Array reduce (return a single element): ");
        Print.print(Arrays
                .stream(array)
                .reduce((left, right) -> left + right)
                .getAsInt());

        System.out.println("Array sort: ");
        Print.print(Arrays
                .stream(array)
                .sorted()
                .toArray());

        System.out.println("Array distinct (group by no sort): ");
        Print.print(Arrays
                .stream(array)
                .distinct()
                .toArray());

        System.out.println("Array peek : ");
        Print.print(Arrays
                .stream(array)
                .peek(e -> e = e + 5)
                .toArray());

        System.out.println("Array flatMap : ");
        Print.print(Arrays
                .stream(array)
                .flatMap(item -> Arrays.stream(array))
                .toArray());
        System.out.println("Array groupingBy : ");
        Print.print(Arrays
                .stream(array)
                .distinct()
                .sorted()
                .toArray());

        System.out.println("Array skip 5 items: ");
        Print.print(Arrays
                .stream(array)
                .skip(5)
                .toArray());
        System.out.println("Array findFirst (first in the stream): ");
        Print.print(Arrays
                .stream(array)
                .findFirst()
                .getAsInt());

        System.out.println("Array min: ");
        Print.print(Arrays
                .stream(array)
                .min()
                .getAsInt());
        System.out.println("Array max: ");
        Print.print(Arrays
                .stream(array)
                .max()
                .getAsInt());

        System.out.println("Array boxed (Boxing elements of stream to an Type an Example <Integer>: ");
        Stream<Integer> stream = Arrays.stream(array).boxed();
        stream
                .forEach(integer -> System.out.print(integer + " / "));
        System.out.println();

        System.out.println("Array sum: ");
        Print.print(Arrays
                .stream(array)
                .sum());

        System.out.println("Array average: ");
        Print.print(Arrays
                .stream(array)
                .average()
                .getAsDouble());

        System.out.println("Array anyMatch (matching with 5: ");
        Print.print(Arrays
                .stream(array)
                .anyMatch(value -> value == 5));

        System.out.println("Array anyMatch (return if all elements are in condition): ");
        Print.print(Arrays
                .stream(array)
                .allMatch(value -> value % 2 == 0));
    }
}