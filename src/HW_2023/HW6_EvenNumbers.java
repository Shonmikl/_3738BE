package HW_2023;

import java.util.Arrays;
import java.util.Scanner;

public class HW6_EvenNumbers {

    public static int[] inputIntArray() {
        System.out.println("Enter the number of numbers in the array:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] arr = new int[i];
        for (int j = 0; j < i; j++) {
            System.out.println("Enter " + (j + 1) + " number:");
            Scanner sc1 = new Scanner(System.in);
            arr[j] = sc1.nextInt();
        }
        System.out.println("Source array: " + Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = inputIntArray();
        System.out.println("Even numbers in array is:");
        Arrays.stream(arr)
                .filter((el) -> (el % 2 == 0))
                .forEach(System.out::println);
    }
}