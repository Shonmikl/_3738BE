package _2023_01_19.reflection;

import _2023_01_19.emp.Employee;

import java.lang.reflect.Field;

public class Ex1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Alexey", "It");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue = (Double) field.get(employee);
        System.out.println(salaryValue);

        field.set(employee, 2222);
        System.out.println(employee);
    }
}
