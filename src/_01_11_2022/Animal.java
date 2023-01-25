package _01_11_2022;

import java.util.Objects;

public class Animal implements Flyable {
    String name;
    int age;
    int weight;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return age == animal.age && weight == animal.weight && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

    @Override
    public void fly() {

    }

    @Override
    public void speedFly() {

    }
}