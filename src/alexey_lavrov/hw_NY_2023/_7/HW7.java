package alexey_lavrov.hw_NY_2023._7;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class HW7 {
    /**
     * TODO: 7. Взять наш класс Student ( или сделать свой) изменить имена и фамилии на заглавные и сгруппировать по курсу СТРИМОМ
     */
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("alexey", "lavrov", 1));
        studentList.add(new Student("alexey", "babaykin", 1));
        studentList.add(new Student("alexey", "khudoshin", 2));
        studentList.add(new Student("irina", "naumenko", 2));
        studentList.add(new Student("michail", "egorov", 3));
        System.out.println(changeStudents(studentList));
    }

    private static Map<Object, List<Student>> changeStudents(List<Student> studentList) {
        return studentList.stream().peek(student -> {
            student.setFirstName(StringUtils.capitalize(student.getFirstName()));
            student.setLastName(StringUtils.capitalize(student.getLastName()));
        }).collect(groupingBy(Student::getCourse));
    }
}
