package _10112022;

import _03112022.students.Student;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info = new Info<>("WWW");
//        System.out.println(info);

//        Info<Integer> info1 = new Info<>(555);
//        System.out.println(info1);

//        Student s1 = new Student("Sergey", 'm', 22, 3, 8.3);
//        Info<Student> info3 = new Info<>(s1);
//        System.out.println(info3);
    }

//    public void m1(Info<String> info) {
//        String s = info.getValue();
//    }
//
//    public void m1(Info<Integer> info) {
//        Integer s = info.getValue();
//    }
}

class Info<T extends Number & Interface> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[+++" + value + "+++]";
    }

    public T getValue() {
        return value;
    }
}

interface Interface {

}