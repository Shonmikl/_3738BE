package alexey_lavrov.project.models;

import alexey_lavrov.project.models.interfaces.Flying;
import alexey_lavrov.project.models.interfaces.Reproducing;

public class Drone extends Bee implements Reproducing, Flying {
    public Drone(int id, String name) {
        super(id, name);
    }

    @Override
    public void reproduce() {
        System.out.println("Drone Interbreed");
    }

    @Override
    public void fly() {
        System.out.println("Drone Flying");
    }
}