package alexey_lavrov.project.database;

import lombok.Getter;
import lombok.Setter;
import alexey_lavrov.project.models.Bee;
import alexey_lavrov.project.models.WorkerBee;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.*;

@Getter
@Setter
public class DB {
    private TreeMap<Bee, Integer> hive = new TreeMap<>();
    private Set<String> classBee = new TreeSet<>();
    private Deque<WorkerBee> beeOnVocation = new ArrayDeque<>();

    public void addBeeToHive(Integer number, Bee bee) {
        hive.put(bee, number);
        addClassBee(bee);

    }

    public Integer getNumberByBee(Bee bee) {
        return hive.get(bee);
    }

    public Integer getCountBeeInHive(){
        return hive.size();
    }

    public Integer catchBeeFromHive(Bee bee) {
        return hive.remove(bee);
    }

    private void addClassBee(@NotNull Bee bee) {
        classBee.add(bee.getClass().getSimpleName());
    }

    public String[] getArrayOfClasses() {
        return classBee.toArray(new String[0]);
    }

    public void sendBeeToRest(WorkerBee wBee) {
        beeOnVocation.add(wBee);
    }

    public WorkerBee getRestedBee() {
        return beeOnVocation.pollFirst();
    }

    public WorkerBee getTiredBee() {
        return beeOnVocation.pollLast();
    }
}