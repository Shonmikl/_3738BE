package _2023_01_19.reflection;

import _2023_01_19.emp.Employee;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionEx1 {
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("_2023_01_19.emp.Employee");
//        Class emp = Employee.class;
//        Employee employee = new Employee();
//        Class employee = e
        Field field = employeeClass.getField("id");
//        System.out.println("Field type is: " + field.getType());
//        System.out.println("-----------------------------------");

//        Field[] fields = employeeClass.getFields();
//        for (Field f : fields) {
//            System.out.println("Field's type is: " + f.getType() + " name is: " + f.getName());
//        }

//        Field[] fields = employeeClass.getDeclaredFields();
//        for (Field f : fields) {
//            System.out.println("Field's type is: " + f.getType() + " name is: " + f.getName());
//        }

//        Method method1 = employeeClass.getMethod("increaseSalary");
//        System.out.println("Return type is: " + method1.getReturnType());
//        System.out.println("Parameter type is: " + Arrays.toString(method1.getParameterTypes()));

        Method method = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type is: " + method.getReturnType());
    }
}