package _13_12_2022.m1;

public class Ex2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        myThread1.start();
        myThread2.start();
        for (int i = 0; i < 500; i++) {
            Thread.sleep(10);
            System.out.print("[HHHHHHHH]");
        }
    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print("[" + i + "]");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (char i = ':'; i < '~'; i++) {
            System.out.print("[" + i + "]");
        }
    }
}