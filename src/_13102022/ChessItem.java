package _13102022;

//Наследование
//Полиморфизм

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ChessItem {
    boolean colour;
    String name;

    int x;
    int y;

    void move() {
        System.out.println("ChessItem move");
    }
}

class Test {
    public static void main(String[] args) {
        ChessItem chessItem = new ChessItem(true, "ROOK", 11, 12);
        System.out.println(chessItem);
    }
}