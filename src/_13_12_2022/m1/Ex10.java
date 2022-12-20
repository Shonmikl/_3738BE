package _13_12_2022.m1;

public class Ex10 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        Thread thread = new Thread(new Worker());


        thread.start();
        thread.join();
        System.out.println("Main ends");
    }
}

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Worker starts");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker ends");
    }
}