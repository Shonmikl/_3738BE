package alexey_lavrov.hw_14112022.parametrized.models;

import java.util.Date;

public class AdultWorkerBee extends WorkerBee {
    public AdultWorkerBee(int id, String name) {
        super(id, name);
    }

    public void protect(){
        System.out.println("AdultWorkerBee Protect");
    }

    public void feed() {
        System.out.println("AdultWorkerBee Feed");
    }

    public void cleanUp() {
        System.out.println("AdultWorkerBee Clean Up");
    }
}