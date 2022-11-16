package aleksey_babaykin.hw20221013;

public class Cat extends AnimalType{

    public Cat(String type, String name) {
        super(type, name);
    }

    @Override
    public void voice() {
        System.out.println("My voice is Meow-meow");
    }
}
