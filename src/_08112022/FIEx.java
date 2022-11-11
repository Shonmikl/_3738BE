package _08112022;

import java.util.function.Predicate;

@FunctionalInterface
public interface FIEx {
    int get();

    //на методы класса Object не распространяется
    boolean equals(Object o);
}