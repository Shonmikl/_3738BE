package _08_11_2022;

@FunctionalInterface
public interface FIEx {
    int get();

    //на методы класса Object не распространяется
    boolean equals(Object o);
}