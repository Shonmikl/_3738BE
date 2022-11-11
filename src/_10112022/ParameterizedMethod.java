package _10112022;

import _10112022.game.Participant;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(121);
        arrayList.add(131);

        int a = GenMethod.getSecondElement(arrayList);
        System.out.println(a);

        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList list = new ArrayList();
        int a1 = list.get(0);
        //int a1 = (Integer) list.get(0);
    }
}

class GenMethod {
    public static <T extends Number> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}

class OtherPair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public void get(V2 value) {
        
    }
}