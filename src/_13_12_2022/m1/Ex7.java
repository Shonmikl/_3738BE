package _13_12_2022.m1;

public class Ex7 implements Runnable{
    @Override
    public void run() {
        System.out.println("Ex7 Run() : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex7());
        thread.run();
        System.out.println("Main() : " + Thread.currentThread().getName());
    }
}