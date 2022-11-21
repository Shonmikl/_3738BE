package alexey_lavrov.project.models;

public class AdultWorkerBee extends WorkerBee {
    public AdultWorkerBee(Integer id, String name) {
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