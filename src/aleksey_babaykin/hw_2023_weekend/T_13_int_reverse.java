package aleksey_babaykin.hw_2023_weekend;

public class T_13_int_reverse {
    public static void main(String[] args) {
        System.out.println(reverseInt(123));
        System.out.println(reverseInt(-123));
    }
    static long reverseInt(int inInt) {
        return inInt < 0
                ? Long.parseLong(new StringBuilder().append(String.valueOf(inInt).replace("-", "")).reverse().toString()) * (-1)
                : Long.parseLong(new StringBuilder().append(inInt).reverse().toString());
    }
}