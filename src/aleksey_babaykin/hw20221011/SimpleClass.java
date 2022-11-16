package aleksey_babaykin.hw20221011;

public class SimpleClass {

    private String name;
    private int id;

    public SimpleClass(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public SimpleClass(String name) {
        this.name = name;
    }

    public SimpleClass(int id) {
        this.id = id;
    }

    public SimpleClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {

    }

}
