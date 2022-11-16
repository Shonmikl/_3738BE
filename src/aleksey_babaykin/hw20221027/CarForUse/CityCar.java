package aleksey_babaykin.hw20221027.CarForUse;

import aleksey_babaykin.hw20221027.Car.Engine;
import aleksey_babaykin.hw20221027.Car.PersonalCar;
import aleksey_babaykin.hw20221027.Enams.CarStatus;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CityCar extends PersonalCar {
    public static final int MAX_CITY_CAR_SPEED = 50;  // TODO added
    public CityCar(String name, CarStatus status, String comfortName) {
        super(name, status, new Engine("Electro"), CityCar.MAX_CITY_CAR_SPEED, comfortName);
    }
}