package _27102022.prirotyQueue;

import _25102022.compare.Employee;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        priorityQueue.add(4);
//        priorityQueue.add(2);
//        priorityQueue.add(21);
//        priorityQueue.add(8);
//        priorityQueue.add(1);
//        priorityQueue.add(178);

        // System.out.println(priorityQueue);

//        System.out.println(priorityQueue.remove());
//        System.out.println(priorityQueue.remove());
//        System.out.println(priorityQueue.remove());
//        System.out.println(priorityQueue.remove());
//        System.out.println(priorityQueue.remove());
//        System.out.println(priorityQueue.remove());
        PriorityQueue<Employee> priorityQueue = new PriorityQueue<>();

        Employee emp1 = new Employee("Alexey", "Lavrov", 38, 5);
        Employee emp2 = new Employee("Irina", "Naumenko", 22, 4);
        Employee emp3 = new Employee("Yuri", "Kuzmenko", 33, 3);
        Employee emp4 = new Employee("Alexandr", "Sapunov", 37, 2);

        priorityQueue.add(emp1);
        priorityQueue.add(emp2);
        priorityQueue.add(emp3);
        priorityQueue.add(emp4);

        System.out.println("*****************************");
        System.out.println(priorityQueue);
        System.out.println("*****************************");

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}
