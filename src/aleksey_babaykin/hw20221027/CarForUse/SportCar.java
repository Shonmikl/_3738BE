package aleksey_babaykin.hw20221027.CarForUse;

import hw20221027.Car.Engine;
import hw20221027.Car.PersonalCar;
import hw20221027.Enams.CarStatus;

public class SportCar extends PersonalCar {
    public static final int MAX_SPORT_CAR_SPEED = 300;  // TODO added
    public SportCar(String name, CarStatus status,  String comfortName) {
        super(name, status, new Engine("Gasoline"), SportCar.MAX_SPORT_CAR_SPEED, comfortName);
    }
}
