package HW_2023;

import java.util.ArrayList;
import java.util.List;

public class HW7_StudentSorting {
    public static void main(String[] args) {
        Student s1 = new Student("Николай", "Гоголь", 'm', 35, 3, 7.8);
        Student s2 = new Student("Тарас", "Шевченко", 'm', 22, 1, 6.2);
        Student s3 = new Student("Леся", "Украинка", 'f', 32, 4, 8.1);
        Student s4 = new Student("Иван", "Франко", 'm', 29, 2, 6.1);
        Student s5 = new Student("Лина", "Костенко", 'f', 92, 5, 8.8);
        Student s6 = new Student("Марко", "Вовчок", 'f', 18, 1, 5.5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        System.out.println("Initial list of students: " + studentList);
        System.out.println("Result list of students:");

        studentList.stream()
                .map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                })
                .map(el -> {
                    el.setSurname(el.getSurname().toUpperCase());
                    return el;
                })
                .sorted((o1, o2) -> o1.getCourse() - o2.getCourse())
                .forEach(System.out::println);
    }
}
