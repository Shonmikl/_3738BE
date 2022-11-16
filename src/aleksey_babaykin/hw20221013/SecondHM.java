package aleksey_babaykin.hw20221013;

public class SecondHM {
    public static void main(String[] args) {
        Dog dog = new Dog("chihuahua", "Charly");
        Cat cat = new Cat("siamskii", "Shura");

        dog.voice();
        dog.eat(1);


        cat.voice();
        cat.eat(2);
    }
}