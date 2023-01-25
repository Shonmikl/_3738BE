package _15_12_2022.m2;

import _06_12_2022.Thing;
import lombok.ToString;

@ToString
public class Ex12 {
    private static final Object lock = new Object();

    Object get() throws InterruptedException {
        Thread.sleep(5000);
        return new Object();
    }

    public static void main(String[] args) {
        Thread mThread = new Thread(new Mobile());
        Thread sThread = new Thread(new Skype());
        Thread wThread = new Thread(new WhatsApp());

        mThread.start();
        sThread.start();
        wThread.start();
    }

    void mobileCall() throws InterruptedException {
        synchronized (get()) {
            System.out.println("Mobile call starts");
            Thread.sleep(2500);
            System.out.println("Mobile call ends");
        }
    }

    void skypeCall() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Skype call starts");
            Thread.sleep(1500);
            System.out.println("Skype call ends");
        }
    }

    void whatsAppCall() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Whats App call starts");
            Thread.sleep(3500);
            System.out.println("Whats App ends");
        }
    }
}

class Mobile implements Runnable {

    @Override
    public void run() {
        try {
            new Ex12().mobileCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Skype implements Runnable {

    @Override
    public void run() {
        try {
            new Ex12().skypeCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class WhatsApp implements Runnable {

    @Override
    public void run() {
        try {
            new Ex12().whatsAppCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

