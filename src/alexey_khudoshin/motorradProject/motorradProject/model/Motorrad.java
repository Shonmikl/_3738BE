package alexey_khudoshin.motorradProject.motorradProject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

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

    public static void main(String[] args) {
        List<Motorrad> motorradList = new ArrayList<>();

        motorradList.add(new Motorrad("Honda CBX 1000", 42, "Red", 1047, 225));
        motorradList.add(new Motorrad("Kawasaki Zephyr", 30, "Deep Blue", 1062, 199));
        motorradList.add(new Motorrad("Kawasaki Zephyr", 30, "Deep Blue", 1062, 199));
        motorradList.add(new Motorrad("Yamaha FZR ", 35, "White", 1002, 260));
        motorradList.add(new Motorrad("BMW 1150RT", 22, "Sky Blue", 1130, 204));
        motorradList.add(new Motorrad("KTM Duke 690", 12, "Orange", 690, 193));
        motorradList.add(new Motorrad("harley davidson sportster 883", 2, "Black", 883, 190));
        motorradList.add(new Motorrad("Ducati Monster 1200", 3, "Red", 1193, 250));
        motorradList.add(new Motorrad("Suzuki GSX 1300 R Hayabusa", 13, "Black Gold", 1299, 312));
        motorradList.add(new Motorrad("husqvarna svartpilen 401 ", 1, "Gray", 373, 168));
    }


}
