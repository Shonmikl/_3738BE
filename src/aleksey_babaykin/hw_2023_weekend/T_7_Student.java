package aleksey_babaykin.hw_2023_weekend;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class T_7_Student {
    static List<Student> list = new ArrayList<>();

    public static void main(String[] args) {
        initList();
        changeStudent(list);
    }
    static void changeStudent(List<Student> inList) {
        inList.stream()
                .map(item -> {
                    item.setName(item.getName().substring(0, 1).toUpperCase() + item.getName().substring(1));
                    return item;
                })
                .collect(Collectors.groupingBy(Student::getCourse , Collectors.mapping(Student::getName, Collectors.joining(" / "))))
                .entrySet()
                .forEach(item -> System.out.println("Course : " + item.getKey()+"; Students name : "+ item.getValue()));
    }
    public static void initList() {
        list.add(new Student("vasiliy", 'm', 30, 5, 4.0));
        list.add(new Student("ivan", 'm', 31, 5, 4.1));
        list.add(new Student("aleksey", 'm', 32, 7, 4.2));
        list.add(new Student("nataliya", 'w', 33, 7, 4.3));
    }
}
@Getter
@Setter
@ToString
@AllArgsConstructor
class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;
}