package aleksey_babaykin.hw20221013;

public abstract class AnimalType implements Animal{

    private String type;
    private String name;

    public AnimalType(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat(int time) {
        if(time < 1) {
            System.out.println("I do not eat");
        } else if (time == 1) {
            System.out.println("I eat " + time + " time");
        } else {
            System.out.println("I eat " + time + " times");
        }
    }

}
