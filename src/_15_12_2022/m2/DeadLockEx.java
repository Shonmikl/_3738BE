package _15_12_2022.m2;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread11 thread11 = new Thread11();
        Thread22 thread22 = new Thread22();

        thread11.start();
        thread22.start();
    }
}

class Thread11 extends Thread {
    public void run() {
        System.out.println("Thread11 try to catch monitor LOCK1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread22 caught monitor LOCK1");
            System.out.println("Thread22 try to catch monitor LOCK2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread11 caught monitor LOCK1 and LOCK2");
            }
        }
    }
}

class Thread22 extends Thread {
    public void run() {
        System.out.println("Thread22 try to catch monitor LOCK2");
        synchronized (DeadLockEx.lock2) {
            System.out.println("Thread11 caught monitor LOCK2");
            System.out.println("Thread11 try to catch monitor LOCK1");
            synchronized (DeadLockEx.lock1) {
                System.out.println("Thread22 caught monitor LOCK1 and LOCK2");
            }
        }
    }
}
