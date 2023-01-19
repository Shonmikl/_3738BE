package _2023_01_19.mr;

public class MR {
    public static void main(String[] args) {
        me(() -> {
            System.out.println("***");
            System.out.println("+++");
        });
        System.out.println("///");
    }

    public static void me(I alexey) {
        System.out.println("!!!");
        alexey.set();
    }
}

@FunctionalInterface
interface I {
    void set();
}