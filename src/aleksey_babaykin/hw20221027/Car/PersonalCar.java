package aleksey_babaykin.hw20221027.Car;

import aleksey_babaykin.hw20221027.Enams.CarStatus;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PersonalCar extends GeneralCar {
    private String comfortName;

    public PersonalCar(String name, CarStatus status, Engine engine, int maxSpeed, String comfortName) {
        super(name, status, engine, maxSpeed);
        this.comfortName = comfortName;
    }
}