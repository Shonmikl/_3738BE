package _2023_01_24;

import jdk.jfr.Description;
import lombok.AllArgsConstructor;

public class Test {
    public static void main(String[] args) {
        Parent parent = new Child("Alexey");
        parent.showInfo();

        Parent parent1 = new Parent("Test");
        Child child = new Child("TEst2");

    }
}

@AllArgsConstructor
class Parent {
    String name;

    void showInfo() {
        System.out.println("Parent class info()");
    }
}

class Child extends Parent {

    public Child(String name) {
        super(name);
    }


    void showInfo1() {
        System.out.println("Child class info()");
    }


}

@FunctionalInterface
interface Interf {

    @Deprecated
    void set();
}