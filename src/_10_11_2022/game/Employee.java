package _10_11_2022.game;

import lombok.ToString;

@ToString
public class Employee extends Participant {
    public Employee(String name, int age) {
        super(name, age);
    }
}