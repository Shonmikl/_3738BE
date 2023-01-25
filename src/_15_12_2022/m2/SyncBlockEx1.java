package _15_12_2022.m2;

public class SyncBlockEx1 {
    public static void main(String[] args) {
        MyRunImpl2 runImpl2 = new MyRunImpl2();

        Thread thread1 = new Thread(runImpl2);
        Thread thread2 = new Thread(runImpl2);
        Thread thread3 = new Thread(runImpl2);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter1 {
    volatile static int count = 0;
}

class MyRunImpl2 implements Runnable {
    private void doWork1() {
        System.out.println("!!!!!!!!!");
    }

    public void doWork() {
        doWork1();
        //t1 t2 t3
        synchronized (this) {
            Counter1.count++;
            System.out.println("[" + Counter1.count + "]");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            doWork();
        }
    }
}