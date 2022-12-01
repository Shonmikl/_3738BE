package homework.project.Interface;

import homework.project.model.Room;

import java.util.Comparator;
public class SortbyArea implements Comparator<Room> {
    public SortbyArea(){
            }

    @Override
    public int compare(Room a, Room b) { return a.getArea() - b.getArea();
    }
}

