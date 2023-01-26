package HW_2023;

import java.util.Scanner;

public class SequenceOfNumbersThatAddUpToANumber {
    public static void main(String[] args) {
        int number, j = 0, count1 = 0, sum = 0;

        HW6_EvenNumbers intArr = new HW6_EvenNumbers();
        int[] arr = HW6_EvenNumbers.inputIntArray();

        System.out.println("Enter magic number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int countMin = arr.length;
        int indexStart = 0;
        int indexEnd = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            j = i;
            sum = 0;
            count1 = 0;
            while (j < arr.length) {
                sum = sum + arr[j];
                count1 = count1 + 1;
                j += 1;
                if (j == arr.length) {
                    break;
                }
                if (sum == number) {
                    break;
                }
            }
            if (count1 < countMin) {
                countMin = count1;
                indexStart = i;
                indexEnd = j - 1;
            }
        }
        System.out.println("Combination is between indexes N" + indexStart + " and N" + indexEnd);
        for (int i = indexStart; i <= indexEnd; i++) {
            System.out.print(arr[i] + "; ");
        }
    }
}
