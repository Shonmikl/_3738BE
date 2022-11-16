package aleksey_babaykin.hw20221027.Car;

import aleksey_babaykin.hw20221027.Enams.CarStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeavyCar extends GeneralCar{

    private int maxWeight;

    public HeavyCar(String name, CarStatus status, Engine engine, int maxSpeed, int maxWeight) {
        super(name, status, engine, maxSpeed);
        this.maxWeight = maxWeight;
    }
}