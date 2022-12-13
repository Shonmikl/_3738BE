package _13_12_2022.m1;

public class Ex9 implements Runnable{
    @Override
    public void run() {
        System.out.println("Ex9 Run() : " + Thread.currentThread().getName());
    }


    public static void main(String[] args) throws InterruptedException {
        Thread ex7 = new Thread(new Ex7());
        Thread ex9 = new Thread(new Ex9());

        ex7.start();
        ex9.start();

        ex7.join();
        ex9.join();
        System.out.println("Main End");
    }
}