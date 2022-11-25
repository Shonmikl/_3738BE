package _22_11_2022;

public class RegexEx3 {
    public static void main(String[] args) {
        //Методы matches() / split()
        String s = "ghhh@gmail.com";
        boolean res = s.matches("\\w+@\\w+\\.(com|ru)");
       // System.out.println(res);

        String s1 = "Reduce the heat  to  medium and add the black beans";
        System.out.println(s1);
        s1 = s1.replace("the", "a");
        System.out.println(s1);

        s1 = s1.replaceAll(" {2,}", " * ");
        System.out.println(s1);

        s1 = s1.replaceAll("\\bb\\w+", "!");
        System.out.println(s1);

        s1 = s1.replaceFirst("\\ba\\w+", "+++");
        System.out.println(s1);



    }
}
