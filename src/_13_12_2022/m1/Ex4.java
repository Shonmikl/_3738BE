package _13_12_2022.m1;

public class Ex4 implements Runnable {
    @Override
    public void run() {
        for (char i = ':'; i < '~'; i++) {
            System.out.print("[" + i + "]");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex4());
        thread.start();

        for (int i = 0; i < 300; i++) {
            System.out.print("[" + i + "]");
        }
    }
}