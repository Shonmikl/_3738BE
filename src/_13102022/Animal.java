package _13102022;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Animal {
    String name;
    String species;

    abstract void move();
}
class Dog extends Animal {

    @Override
    void move() {
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
    }
}