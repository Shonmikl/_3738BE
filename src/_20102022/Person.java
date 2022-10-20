package _20102022;

import java.util.Objects;

public class Person {
    private final int age = 38;

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getAge());
        System.out.println("/////////////////////////////");
        System.out.println(person.getAge());
    }
}
