package alexey_lavrov.hw_NY_2023._11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW11 {
    /**
     * TODO: 11***. Дан массив интов. Написать метод в который вы передаете массив и еще одно число.
     *  Метод должен ВЕРНУТЬ ИНДЕКС ДВУХ ЧИСЕЛ СУММА КОТОРЫХ ДАЕТ ЭТО ЧИСЛО. ЕСЛИ ТАКОВЫХ НЕТ - СООБЩЕНИЕ.
     */
    public static void main(String[] args) {
        System.out.println("Индексы элементов для заданной суммы:");
        getIndexesOfSum(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},12).forEach(i -> System.out.println(Arrays.toString(i)));
    }

    private static List<Integer[]> getIndexesOfSum(int[] array, int sum) {
        List<Integer[]> result = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length-2; i++) {
            int diff = sum-array[i];
            if(diff>0){
                int secElement = findNumber(diff,array,i+1,array.length-1);
                if(secElement>0) {
                    result.add(new Integer[]{i,secElement});
                }
            }
        }
        if(result.isEmpty()) {
            throw new RuntimeException("Elements was not found!");
        }
        return result;
    }

    private static int findNumber(int number, int[] arr, int firstEl, int lastEl) {
        if(lastEl<firstEl) {
            return -1;
        }
        int middle = (firstEl+lastEl)/2;
        if(arr[middle] == number) {
            return middle;
        } else if(arr[middle]>number){
            return findNumber(number, arr,firstEl,middle-1);
        } else {
            return findNumber(number, arr,middle+1,lastEl);
        }
    }
}