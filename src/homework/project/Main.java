package homework.project;

import homework.project.Interface.SortbyArea;
import homework.project.model.Room;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(1, "ком", 20, 1000, "Ivanova Lena", 6);
        Room room2 = new Room(2, "жил", 35, 500, "Ivan Ivanov", 12);
        Room room3 = new Room(3, "ком", 50, 2000, "Backer", 3);
        Room room4 = new Room(4, "жил", 50, 300, "Petrov", 24);
        Room room5 = new Room(5, "ком", 70, 500, "Sidorov", 10);
        ArrayList<Room> rooms = new ArrayList();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
        Iterator var7 = rooms.iterator();

        while(var7.hasNext()) {
            Room room = (Room)var7.next();
            System.out.println(room);
        }

        rooms.sort(new SortbyArea());
        System.out.println("Отсортированно по площади");
        List<Room> sorted = rooms.stream().sorted((o1, o2) -> {
            return Integer.compare(o2.getArea(), o1.getArea());
        }).limit(3L).toList();
        Iterator var11 = sorted.iterator();

        while(var11.hasNext()) {
            Room room = (Room)var11.next();
            System.out.println(room);
        }

    }
}