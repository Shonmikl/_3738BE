package _13_12_2022.m1;

public class Ex5 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (char i = ':'; i < '~'; i++) {
                System.out.print("[" + i + "]");
            }
        }).start();

        new Thread(()-> System.out.println("HI")).start();
    }
}