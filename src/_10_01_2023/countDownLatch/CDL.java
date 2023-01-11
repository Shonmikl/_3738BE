package _10_01_2023.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class CDL {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void getStaffReady() throws InterruptedException {
        Thread.sleep(2500);
        System.out.println("Staff is ready");
        countDownLatch.countDown();
        System.out.println("countDownLatch " + countDownLatch.getCount());
    }

    private static void everyThingIsReady() throws InterruptedException {
        Thread.sleep(3500);
        System.out.println("Everything is ready");
        countDownLatch.countDown();
        System.out.println("countDownLatch " + countDownLatch.getCount());
    }

    private static void open() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("The Market is opened");
        countDownLatch.countDown();
        System.out.println("countDownLatch " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Person("Alexey Ivan", countDownLatch);
        new Person("Alexey B", countDownLatch);
        new Person("Alexey L", countDownLatch);
        new Person("Irina", countDownLatch);
        new Person("Mikhail", countDownLatch);

        getStaffReady();
        everyThingIsReady();
        open();
    }
}

class Person extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Person(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " started to buy");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}