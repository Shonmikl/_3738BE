package _13102022;

public class Rook extends ChessItem {
    int aaa;
    //new
    public Rook(boolean colour, String name, int x, int y, int aaa) {
        super(colour, name, y, x);
        this.aaa = aaa;
    }

    public Rook(boolean colour, String name, int x) {
        super(colour, name, x);
    }

    public Rook(int aaa) {
        this.aaa = aaa;
    }

    @Override
    void move() {
        System.out.println("ROOK MOVE");
    }

    @Override
    public String toString() {
        return "Rook{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
//        ChessItem chessItem = new ChessItem();
//        chessItem.eat();

        ChessItem rook = new Rook(true, "ROOK", 55);
        ChessItem rook1 = new Rook(true, "ROOK", 55);
        ChessItem rook2 = new Rook(true, "ROOK", 55);
        ChessItem rook3 = new Rook(true, "ROOK", 55);
        ChessItem rook4 = new Rook(true, "ROOK", 55);
        ChessItem rook5 = new Rook(true, "ROOK", 55);
        ChessItem rook6 = new Rook(true, "ROOK", 55);
        ChessItem rook7 = new Rook(true, "ROOK", 55);
        ChessItem rook8 = new Rook(true, "ROOK", 55);
        ChessItem rook9 = new Rook(true, "ROOK", 55);
        System.out.println(rook);
        rook.move();

    }
}