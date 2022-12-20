package _15_12_2022.m2;

public class VolEx extends Thread {
    volatile boolean b = true;

    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished and counter is: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolEx thread = new VolEx();
        thread.start();

        Thread.sleep(1500);
        System.out.println("After 1.5 seconds thread woke up");
        thread.b = false;
        thread.join();
        System.out.println("The end" );
    }
}
