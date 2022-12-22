package _22_12_2022.threadPool1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunnableImpl99());
//        }

//        scheduledExecutorService.schedule(new RunnableImpl99(), 3, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate
                (new RunnableImpl99(), 3, 1, TimeUnit.SECONDS);


        scheduledExecutorService.shutdown();
    }
}

class RunnableImpl99 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " end");
    }
}
