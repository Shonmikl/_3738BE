package _20_12_2022.interrupted;

public class InterruptedEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main() starts");
        InterThread thread = new InterThread();
        thread.setDaemon(true);
        thread.start();

        Thread.sleep(500);
//        thread.interrupt();

//        thread.join();
        System.out.println("Main() ends");
    }
}

class InterThread extends Thread {
    long sum;

    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            if(isInterrupted()) {
                System.out.println("Wants to be interrupted");
                return;
            }

            sum += i;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted while sleeping");
                return;
            }
            System.out.println(sum);
        }
    }
}