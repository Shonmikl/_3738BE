package _2023_01_19.emp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Employee {
    public int id;
    public String name;
    public String department;

    private double salary = 999;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

//    public Employee(int id, String name, String department, double salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }

//    public void setSalary(double salary) {
//        this.salary = salary;
//    }

    private void changeDep(String newDepName) {
        department = newDepName;
        System.out.println("New department name is: " + department);
    }

    public void increaseSalary() {
        salary *= 2; // == salary = salary * 2
    }
}