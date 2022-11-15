package alexey_lavrov.hw_14112022.parametrized.models;

import alexey_lavrov.hw_14112022.parametrized.models.interfaces.Oviposition;
import alexey_lavrov.hw_14112022.parametrized.models.interfaces.Reproducing;

import java.util.Date;

public class Queen extends Bee implements Oviposition, Reproducing {

    public Queen(int id, String name) {
        super(id, name);
    }

    @Override
    public void makeNewEggs() {
        System.out.println("Queen Make New Egg");
    }

    @Override
    public void reproduce() {
        System.out.println("Queen Interbreed");
    }

    @Override
    public void fly() {
        System.out.println("Queen flying to Interbreed");
    }
}