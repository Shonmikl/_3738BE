package alexey_lavrov.hw_14112022.parametrized.models;

import alexey_lavrov.hw_14112022.parametrized.models.interfaces.Flying;
import alexey_lavrov.hw_14112022.parametrized.models.interfaces.Reproducing;

import java.util.Date;

public class Drone extends Bee implements Reproducing, Flying {
    public Drone(int id, String name, Date birthday, float size, boolean isInHouse) {
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