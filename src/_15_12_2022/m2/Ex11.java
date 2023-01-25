package _15_12_2022.m2;

public class Ex11 {
    static int counter = 0;
    public static synchronized void increment() {
        counter++;
        System.out.print("[" + counter + "]");
    }

    void get() {

    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class R implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            Ex11.increment();
        }
    }
}