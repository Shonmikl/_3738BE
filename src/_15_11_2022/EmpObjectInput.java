package _15_11_2022;

import _15_11_2022.employees.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpObjectInput {
    public static void main(String[] args) {
        Employee newEmp;
        try (ObjectInputStream inputStream =
                new ObjectInputStream(new FileInputStream("emp11s.bin"))){
            newEmp = (Employee) inputStream.readObject();
            System.out.println(newEmp);
            System.out.println("DONE!!!");

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
