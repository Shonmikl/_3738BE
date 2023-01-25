package _15_12_2022.m2;

public class SyncBlockEx2 {
    volatile static int counter = 0;

    public static void increment() {
        synchronized (SyncBlockEx2.class){
            counter++;
        }
    }

    public static void main(String[] args) {

    }
}
