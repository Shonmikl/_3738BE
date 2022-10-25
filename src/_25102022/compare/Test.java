package _25102022.compare;

import _25102022.compare.Employee;
import _25102022.compare.SurnameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee("Alexey", "Lavrov", 38, 5);
        Employee emp2 = new Employee("Irina", "Naumenko", 22, 4);
        Employee emp3 = new Employee("Yuri", "Kuzmenko", 33, 3);
        Employee emp4 = new Employee("Alexandr", "Sapunov", 37, 2);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(new Employee("Mikhail", "Egorov", 38, 8));

//        System.out.println(list);
//        System.out.println("******************************************");

        Collections.sort(list, new SurnameComparator());
        //todo можно ли передать третий параметр и какой в метод sort()
        System.out.println(list);
    }
}