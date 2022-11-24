package _24_11_2022;

public class StringsEx {
    public static void main(String[] args) {
        String s = "Java";
        s.toUpperCase();
        s.getBytes();
        s.length();
        s.toLowerCase();
        s.compareTo(s);
//        System.out.println(s.substring(0, 4));
//        System.out.println("0123456789".substring(1, 4));
//        System.out.println(s.toCharArray());
//        System.out.println(s.hashCode());
//        System.out.println(s.charAt(1));
//        System.out.println(s.indexOf("v"));

        StringBuffer stringBuffer = new StringBuffer("PHP");
        StringBuilder stringBuilder = new StringBuilder("Java");

        stringBuilder
                .append("!")
                .append("&")
                .append("*");
//        System.out.println(stringBuilder);

//        stringBuffer
//                .append("()()");

        stringBuffer.appendCodePoint(65);
        System.out.println(stringBuffer);
    }
}