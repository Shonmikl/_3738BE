package alexey_lavrov.hw_14112022.parametrized.models.comparators;

import alexey_lavrov.hw_14112022.parametrized.models.Bee;

import java.util.Comparator;

public class BeeComparator implements Comparator<Bee> {
    @Override
    public int compare(Bee bee1, Bee bee2) {
        int result;
        if ((result = bee1.getName().compareTo(bee2.getName())) == 0) {
            if ((result = bee1.getIsInHouse().compareTo(bee2.getIsInHouse())) == 0) {
                result = bee1.getId().compareTo(bee2.getId());
            }
        }
        return result;
    }
}