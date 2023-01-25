package _2023_01_19.mr;

public class MR1 {
    public static void main(String[] args) {
        me1(MR1::me2);
        System.out.println("///");
    }

    public static void me2() {
        System.out.println("***");
        System.out.println("+++");
    }

    public static void me1(I alexey) {
        System.out.println("!!!");
        alexey.set();
    }

}

@FunctionalInterface
interface I2 {
    void set();
}