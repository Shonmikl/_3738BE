package alexey_lavrov.project.models;

import alexey_lavrov.project.models.interfaces.Flying;
import alexey_lavrov.project.models.interfaces.Working;

public class WorkerBee extends Bee implements Flying, Working {

    public WorkerBee(Integer id, String name) {
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