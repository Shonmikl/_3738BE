package alexey_lavrov.project.models;

public class YoungWorkerBee extends WorkerBee{
    public YoungWorkerBee(Integer id, String name) {
        super(id, name);
    }

    public void bringWatter() {
        System.out.println("YoungWorkerBee Bring watter");
    }
}