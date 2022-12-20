package _20_12_2022.lockReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx {
    public static void main(String[] args) {
        Call call = new Call();

        Thread mob = new Thread(call::mobileCall);
        Thread skype = new Thread(call::skypeCall);
        Thread wa = new Thread(call::whatsAppCall);

        mob.start();
        skype.start();
        wa.start();
    }
}

class Call {
    private final Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(2500);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
//        finally {
//            lock.unlock();
//        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(3500);
            System.out.println("Skype call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        finally {
//            lock.unlock();
//        }
    }

    void whatsAppCall() {
        lock.lock();
        try {
            System.out.println("WhatsAppCall call starts");
            Thread.sleep(4500);
            System.out.println("WhatsAppCall call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        finally {
//            lock.unlock();
//        }
    }
}