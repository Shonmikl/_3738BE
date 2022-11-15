package alexey_lavrov.hw_14112022.parametrized.database;

import lombok.Getter;
import lombok.Setter;
import alexey_lavrov.hw_14112022.parametrized.models.Bee;
import alexey_lavrov.hw_14112022.parametrized.models.WorkerBee;
import org.jetbrains.annotations.NotNull;

import java.util.*;

@Getter
@Setter
public class DB {
    private TreeMap<Bee, Integer> hive = new TreeMap<>();
    private Set<String> classBee = new TreeSet<>();
    private Deque<WorkerBee> beeOnVocation = new ArrayDeque<>();

    public void addBeeToHive(Integer number, Bee bee) {
        hive.put(bee, number);
    }

    public Integer getNumberByBee(Bee bee) {
        return hive.get(bee);
    }

    public Integer catchBeeFromHive(Bee bee) {
        return hive.remove(bee);
    }

    public void addClassBee(@NotNull Bee bee) {
        classBee.add(bee.getClass().getSimpleName());
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