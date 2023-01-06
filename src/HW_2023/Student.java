package HW_2023;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student {
    private String name, surname;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;
}
