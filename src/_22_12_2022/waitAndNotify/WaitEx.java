package _22_12_2022.waitAndNotify;

import lombok.AllArgsConstructor;

public class WaitEx {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}

class Market {
    private int breadCount = 0;
    private final Object lock = new Object();

    public synchronized void getBread() {
        synchronized (lock) {
            while (breadCount < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            breadCount--;
            System.out.println("Consumer has bought one bread");
            System.out.println("Bread numbers is: " + breadCount);
            notify();
        }
    }

    public synchronized void putBread() {
        synchronized (lock) {
            while (breadCount >= 5) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            breadCount++;
            System.out.println("Producer has added bread");
            System.out.println("Bread numbers is: " + breadCount);
            lock.notify();
        }
    }
}

@AllArgsConstructor
class Producer implements Runnable {
    Market market;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

@AllArgsConstructor
class Consumer implements Runnable {
    Market market;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}
