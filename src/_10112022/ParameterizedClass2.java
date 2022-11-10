package _10112022;



public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<Object> pair = new Pair<>("Mikhail", 3);
        System.out.println(pair.getValue1() + " ::: " + pair.getValue2());
    }
}

class Pair<V> {
    private V value1;
    private V value2;

    public Pair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}
