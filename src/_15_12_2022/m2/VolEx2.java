package _15_12_2022.m2;

public class VolEx2 {

    static boolean b = true;

    public static void get() {
        long counter = 0;
        while (b) {
            counter++;
            if(counter > 3_000_000) {
                b = false;
            }
        }
        System.out.println("Loop is finished and counter is: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        get();
        System.out.println("The end" );
    }
}