package _15_11_2022;

import _15_11_2022.employees.Employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpObjectOut {
    public static void main(String[] args) {
        Employee newEmp = new Employee("Alexey", "IT", "Khudoshin",
                38, 10000);
        try (ObjectOutputStream outputStream =
                new ObjectOutputStream(new FileOutputStream("emp11s.bin"))){
            outputStream.writeObject(newEmp);
            System.out.println("DONE!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
