package _27102022.entrySet;

import _25102022.compare.Employee;

import java.util.HashMap;
import java.util.Map;

public class EntrySetEx {
    public static void main(String[] args) {
        Map<Employee, Double> map = new HashMap<>();
        Employee emp1 = new Employee("Alexey", "Lavrov", 38, 5);
        Employee emp2 = new Employee("Irina", "Naumenko", 22, 4);
        Employee emp3 = new Employee("Yuri", "Kuzmenko", 33, 3);
        Employee emp4 = new Employee("Alexandr", "Sapunov", 37, 2);

        map.put(emp1, 8.5);
        map.put(emp2, 8.3);
        map.put(emp3, 8.2);

        System.out.println(emp1.hashCode());

//        for (Map.Entry<Employee, Double> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
    }
}