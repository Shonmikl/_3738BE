package _10_01_2023.atom;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInt {

   static AtomicInteger counter = new AtomicInteger(0);

    public static void increment() {
        counter.addAndGet(5);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MRI());
        Thread thread2 = new Thread(new MRI());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class MRI implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicInt.increment();
        }
    }
}