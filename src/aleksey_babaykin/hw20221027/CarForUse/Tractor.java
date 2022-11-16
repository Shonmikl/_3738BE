package aleksey_babaykin.hw20221027.CarForUse;

import hw20221027.Car.Engine;
import hw20221027.Car.HeavyCar;
import hw20221027.Enams.CarStatus;
public class Tractor extends HeavyCar {
    public static final int MAX_TRACTOR_SPEED = 30;  // TODO added
    public static final int MAX_TRACTOR_WEIGHT = 30000;  // TODO added
    public Tractor(String name, CarStatus status, Engine engine) {
        super(name, status, engine, Tractor.MAX_TRACTOR_SPEED, Tractor.MAX_TRACTOR_WEIGHT);
    }
}
