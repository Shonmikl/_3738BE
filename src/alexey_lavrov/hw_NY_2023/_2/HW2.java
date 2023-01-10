package alexey_lavrov.hw_NY_2023._2;

import java.util.stream.Stream;

public class HW2 {
    /**
     * TODO: 2****. Написать 3 метода который который выводит на экран ЗНАЧЕНИЕ числа фибоначчи. Как выглядит ряд - погуглите [0 1 1 2 3 5 8 13 21 44……] !!! 34 !!!!!
     * input -> 5
     * out -> 3
     * input -> 8
     * out -> 13
     */
    public static void main(String[] args) {
        System.out.println(fibonachiSimple(5));

        System.out.println(fibonachiSimple(8));
        System.out.println(fibonachiRecursion(8));
        System.out.println(fibonachiSream(8));

        System.out.println(fibonachiSimple(77));
        System.out.println(fibonachiRecursion(77));
        System.out.println(fibonachiSream(77));


    }

    private static long fibonachiSimple(int number) {
        long curr = 1L;
        long prev = 0L;
        for (int i = 1; i < number - 1; i++) {
            long tmpCurr = curr;
            curr = prev + curr;
            prev = tmpCurr;
        }
        return curr;
    }

    private static long fibonachiRecursion(int number) {
        return fibonachiRecursion(number, 0, 0, 0);
    }

    private static long fibonachiRecursion(int number, int counter, long prevVal, long currentValue) {
        if (counter == number - 1) {
            return currentValue;
        }
        counter++;
        return fibonachiRecursion(number, counter, currentValue, currentValue + prevVal + (currentValue == 0 ? 1 : 0));
    }

    private static Long fibonachiSream(int number) {
        return Stream
                .iterate(new long[]{0L, 1L}, p -> new long[]{p[1], p[0] + p[1]}) // создаем последовательность по формуле
                .map(p -> p[0])
                .limit(number) // ограничиваем последовательность номером последнего элемента
                .reduce((first, second) -> second) // берем последний элемент
                .orElse(null); // если пусто возвращаем null
    }

}
