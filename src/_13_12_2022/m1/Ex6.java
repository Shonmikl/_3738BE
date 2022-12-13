package _13_12_2022.m1;

public class Ex6 {
    public static void main(String[] args) {
        MyThread2 thread = new MyThread2();
        thread.setName("Dead POOL");
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of thread is: " + thread.getName());

        System.out.println("Priority level of thread is: " +
                thread.getPriority());
    }
}
