package alexey_lavrov.hw_14112022.parametrized.models;

import java.util.Date;

public class YoungWorkerBee extends WorkerBee{
    public YoungWorkerBee(int id, String name) {
        super(id, name);
    }

    public void bringWatter() {
        System.out.println("YoungWorkerBee Bring watter");
    }
}