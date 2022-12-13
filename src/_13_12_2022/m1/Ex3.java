package _13_12_2022.m1;

public class Ex3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThreadRun1());
        Thread thread2 = new Thread(new MyThreadRun2());

        thread1.start();
        thread2.start();
    }
}

class MyThreadRun1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print("[" + i + "]");
        }
    }
}

class MyThreadRun2 implements Runnable {
    @Override
    public void run() {
        for (char i = ':'; i < '~'; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print("[" + i + "]");
        }
    }
}