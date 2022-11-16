package aleksey_babaykin.hw20221013;

public class Dog extends AnimalType{

    public Dog(String type, String name) {
        super(type, name);
    }

    @Override
    public void voice() {
        System.out.println("My voice is Gaw-Gaw");
    }
}
