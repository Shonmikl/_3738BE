package alexey_khudoshin.motorradProject.db;

import motorradProject.model.Motorrad;

import java.util.ArrayList;
import java.util.List;

public class DbMotorrad {
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

        List<String> nameMoto = new ArrayList<>();
        for (Motorrad motorrad : motorradList) {
            nameMoto.add(motorrad.getName());
        }
        for (int i = 0; i < motorradList.size(); i++) {

        }
        System.out.println(nameMoto);

        System.out.println();

        List<Integer> motorVolume = new ArrayList<>();
        for (Motorrad motorrad : motorradList) {
            motorVolume.add(motorrad.getVolume());
        }
        System.out.println(motorVolume);
    }
}
