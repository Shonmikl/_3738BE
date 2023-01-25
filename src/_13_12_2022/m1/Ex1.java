package _13_12_2022.m1;

public class Ex1 extends Thread {
    public void run() {
        for (char i = ':'; i < '~'; i++) {
            System.out.print("[" + i + "]");
        }
    }

    public static void main(String[] args) {
        Ex1 thread = new Ex1();
        thread.start();

        for (int i = 0; i < 500; i++) {
            System.out.print("[" + i + "]");
        }
    }
}
