package HW_2023;

import java.util.Scanner;

public class HW2_FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("The number of the Fibonacci series under the index is: " + fibNumbRec(10));
    }

    public static int fibonacciNumberCycle() {
        Scanner sc = new Scanner(System.in);
        int index, n0, n1, fib = 0;
        System.out.println("Enter the integer index number of the fibonacci series from 1 to 92: ");
        index = sc.nextInt();
        System.out.println("index = " + index);
        n0 = 0;
        n1 = 1;

        if (index == 0) {
            fib = 0;
        }
        if (index == 1) {
            fib = 1;
        }
        if (index < 0 || index > 92 || !sc.hasNextInt()) {
            throw new IndexOutOfBoundsException(index);
        }
        for (int j = 2; j <= index; j++) {
            fib = n0 + n1;
            n0 = n1;
            n1 = fib;
        }
        System.out.println("The number of the Fibonacci series under the index " + index + " is: " + fib);
        return index;
    }


    public static int fibNumbRec(int index) {

        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        if (index < 0 || index > 92) {
            throw new IndexOutOfBoundsException(index);
        } else {
            return fibNumbRec(index - 2) + fibNumbRec(index - 1);
        }
    }


}