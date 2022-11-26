package alexey_khudoshin.motorradProject.motorradProject.db;
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
}
