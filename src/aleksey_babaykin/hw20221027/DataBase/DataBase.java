package aleksey_babaykin.hw20221027.DataBase;

import hw20221027.Car.Car;

import java.util.*;

public class DataBase {
    Map<Car,Car> map = new HashMap<>();
    Set<Car> set = new TreeSet<>();
    Queue<Car> queue = new ArrayDeque<>();
    Map<Car,Car> treeMap = new TreeMap<>();

    public void addItem(Car car){
        map.put(car, car);
        set.add(car);
        queue.add(car);
        treeMap.put(car, car);
    }

    public void printHashMap() {
        System.out.println("\n HashMap:");
        for (Map.Entry<Car, Car> item : map.entrySet()) System.out.print(item.getValue().getName() + ", | ");
    }

    public void printTreeSet() {
        System.out.println("\n TreeSet");
        for (Car car : set)  System.out.print(car.getName() + ", | ");
    }

    public void printDeque() {
        System.out.println("\n Deque : ");
        for (Car car : queue) System.out.print(car.getName() + ", | ");
    }

    public void printTreeMap() {
        System.out.println("\n TreeMap : ");
        for(Map.Entry<Car,Car> item : treeMap.entrySet()) System.out.print(item.getValue().getName() + ", | ");
    }
}
