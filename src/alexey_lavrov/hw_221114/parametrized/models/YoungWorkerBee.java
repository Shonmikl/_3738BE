package alexey_lavrov.hw_221114.parametrized.models;

public class YoungWorkerBee extends WorkerBee{
    public YoungWorkerBee(int id, String name) {
        super(id, name);
    }

    public void bringWatter() {
        System.out.println("YoungWorkerBee Bring watter");
    }
}