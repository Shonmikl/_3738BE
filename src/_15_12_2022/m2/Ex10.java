package _15_12_2022.m2;

public class Ex10 {
    public static void main(String[] args) {
        MyRunImpl1 runImpl1 = new MyRunImpl1();

        Thread thread1 = new Thread(runImpl1);
        Thread thread2 = new Thread(runImpl1);
        Thread thread3 = new Thread(runImpl1);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Counter {
    static int count = 0;
}

class MyRunImpl1 implements Runnable {

    public void increment() {
        Counter.count++;
        System.out.println("[" + Counter.count + "]");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
