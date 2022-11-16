package aleksey_babaykin.hw20221027.CarForUse;

import hw20221027.Car.Engine;
import hw20221027.Car.HeavyCar;
import hw20221027.Enams.CarStatus;

public class Truck extends HeavyCar {
    public static final int MAX_TRUCK_SPEED = 100;  // TODO added

    public Truck(String name, CarStatus status, Engine engine, int maxWeight) {
        super(name, status, engine, Truck.MAX_TRUCK_SPEED, maxWeight);
    }
}
