package _10_01_2023.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Alexey Ivan", callBox);
        new Person("Alexey B", callBox);
        new Person("Alexey", callBox);
        new Person("Irina", callBox);
        new Person("Mikhail", callBox);
    }
}

class Person extends Thread {
    String name;
    private final Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is waiting for...");
            callBox.acquire();
            sleep(2500);
            System.out.println(name + " is using the phone");
            sleep(2500);
            System.out.println(name + " finished the call");
            sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}
