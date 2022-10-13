package _13102022;

//Наследование
//Полиморфизм
public class ChessItem {

    boolean colour;
    String name;

    int x;
    int y;

    public ChessItem(boolean colour, String name, int x, int y) {
        this.colour = colour;
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public ChessItem(boolean colour, String name, int x) {
        this.colour = colour;
        this.name = name;
        this.x = x;
    }

    public ChessItem() {
    }

    void move() {
        System.out.println("ChessItem move");
    }

    void eat() {
        System.out.println("ChessItem eat");
    }
}