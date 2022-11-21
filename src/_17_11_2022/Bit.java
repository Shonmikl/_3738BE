package _17_11_2022;

public class Bit {
    public static void printBinary(int b) {
        System.out.println("0b" + Integer.toBinaryString(0b100000000 | (b & 0xff)).substring(1));
    }

    public static String binaryStr(int b) {
        return "0b" + Integer.toBinaryString(0b100000000 | (b & 0xff)).substring(1);
    }

    public static void main(String[] args) {
        int i = 0b00000100;
//        System.out.println("Десятичная система " + (i >> 1));
//        System.out.println("Двоичная система " + binaryStr(i >> 1));

        System.out.println("Десятичная система " + (i << 1));
        System.out.println("Двоичная система " + binaryStr(i << 1));
    }
}