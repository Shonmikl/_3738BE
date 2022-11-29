package _29_11_2022;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

    public int getSecond(int[] array) {
        int i;
        if (array.length < 2) {
            throw new NotCompatibleArrayException(Messages.getLengthMessages());
        } else {
            i = array[1];
        }
        return i;
    }

    public void getSecondVoid(int[] array) {
        if (array.length < 2) {
            throw new NotCompatibleArrayException(Messages.getLengthMessages());
        } else {
            System.out.println(array[1]);
        }
    }
}