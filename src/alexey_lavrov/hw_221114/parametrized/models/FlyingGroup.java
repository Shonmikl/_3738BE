package alexey_lavrov.hw_221114.parametrized.models;

import alexey_lavrov.hw_221114.parametrized.models.interfaces.Flying;

import java.util.ArrayList;
import java.util.List;

public class FlyingGroup <B extends Flying>{
    private int groupNumber;
    private final List<B> flyingGroup = new ArrayList<>();

    public FlyingGroup(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public List<B> getFlyingGroup() {
        return flyingGroup;
    }

    public void addFlyingMember(B bee) {
        flyingGroup.add(bee);
    }


    public void addFlyingGroup(FlyingGroup<B> anotherGroup) {
        flyingGroup.addAll(anotherGroup.getFlyingGroup());
        groupNumber+= anotherGroup.getGroupNumber();
    }
}
