package _10_11_2022.game;

import lombok.ToString;

@ToString
public class Student extends Participant{
    public Student(String name, int age) {
        super(name, age);
    }
}
