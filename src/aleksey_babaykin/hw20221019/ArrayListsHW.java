package aleksey_babaykin.hw20221019;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListsHW {


    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        ArrayListsHW arrayListsHW = new ArrayListsHW();

        arrayListsHW.addItemsToArray(list1,5);
        System.out.println("1) ArrayList : " + list1);

        arrayListsHW.addItemsToArray(list2,7);
        System.out.println("2) LinkedList : " + list2);
    }

    public void addItemsToArray(List<Integer> list, int index){
        Random r = new Random();
        for (int i = 1 ; i <= index; i++ ){
            list.add(r.nextInt(100));
        }
    }
}
