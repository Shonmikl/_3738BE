package alexey_khudoshin.motorradProject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class Motorrad {
    private String name;
    private int age;
    private String color;
    private int volume;
    private int maxSpeed;



}
