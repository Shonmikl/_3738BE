package alexey_lavrov.hw_14112022.parametrized.models;

import alexey_lavrov.hw_14112022.parametrized.models.interfaces.Flying;
import alexey_lavrov.hw_14112022.parametrized.models.interfaces.Working;

import java.util.Date;

public class WorkerBee extends Bee implements Flying, Working {

    public WorkerBee(int id, String name) {
        super(id, name);
    }

    @Override
    public void fly() {
        System.out.println("Worker Bee Flying");
    }

    @Override
    public void work() {
        System.out.println("Worker Bee bring nectar");
    }
}