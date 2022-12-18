package motorradProject.db;
import lombok.Getter;
import lombok.Setter;
import motorradProject.model.Motorrad;
import motorradProject.model.OneCylinder;
import org.jetbrains.annotations.NotNull;

import java.util.*;
@Getter
@Setter

public class DbMotorrad {
    private TreeMap<Motorrad, Integer> garage = new TreeMap<>();
    private Set<String> classMotorrad = new TreeSet<>();
    private Deque<OneCylinder> motorradUnderRepair = new ArrayDeque<>();

    public void addMotorradToGarage(Integer number, Motorrad motorrad) {
        garage.put(motorrad, number);
    }

    public Integer getNumberByMotorrad(Motorrad motorrad) {
        return garage.get(motorrad);
    }

    public Integer backMotorradFromGarage(Motorrad motorrad) {
        return garage.remove(motorrad);
    }

    public void addClassMotorrad(@NotNull Motorrad motorrad) {
        classMotorrad.add(motorrad.getClass().getSimpleName());
    }

    public void sendMotorradToService(OneCylinder oCylynder) {
        motorradUnderRepair.add(oCylynder);
    }

    public OneCylinder getMotorradFromService() {
        return motorradUnderRepair.pollFirst();
    }

    public OneCylinder getBrockenMoto() {
        return motorradUnderRepair.pollLast();
    }

    public static List<Motorrad> MotoDb() {
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

        return motorradList;
    }
}
