package aleksey_babaykin.hw_2023_weekend;

import java.util.Arrays;

// it is possible to do for (for) --- O(n**2)
// the current realisation is O(log(n))
public class T_11_Int_Number {
    static int[] arrayMain = {100, 58, 8, 0, -100, -13, 7, 15, 4, 6, 8, 3, 5, 22, 14, 7};
    static int beginIndex;
    static int endIndex;

    public static void main(String[] args) {
        getSumIndex(arrayMain, 16);
        getSumIndex(arrayMain, 19);
        getSumIndex(arrayMain, 55);
        getSumIndex(arrayMain, 0);

    }
    public static void getSumIndex(int[] array, int summ) {
        if (array.length > 1) {
            int[] arrayCopy = Arrays.copyOf(array,array.length);
            Arrays.sort(arrayCopy);
            beginIndex = -1;
            endIndex = -1;
            int tmpBegin = 0;
            int tmpEnd = arrayCopy.length - 1;
            while (tmpBegin < tmpEnd){
                if( summ == arrayCopy[tmpBegin] + arrayCopy[tmpEnd]) {
                    for (int i = 0; beginIndex == -1 || endIndex == -1; i++) {
                        if (beginIndex == -1 && arrayCopy[tmpBegin] == array[i]) {
                            beginIndex = i;
                        }
                        if (endIndex == -1 && arrayCopy[tmpEnd] == array[i] && beginIndex != i) {
                            endIndex = i;
                        }
                    }
                    System.out.printf("\nFirst index = %d, value = %d;  Second index  = %d, value = %d. Amount = %d ",
                            beginIndex, array[beginIndex],  endIndex, array[endIndex], summ );
                    return;
                } else if (summ < arrayCopy[tmpBegin] + arrayCopy[tmpEnd]) {
                    tmpEnd--;
                }else{
                    tmpBegin++;
                }
            }
        }
        System.out.printf("\nThere is not numbers with sum = %d", summ);
        beginIndex = -1;
        endIndex = -1;
    }
}