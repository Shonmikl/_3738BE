package _15_11_2022;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
//Для чтения и записи объектов
public class ObjectOut {
    public static void main(String[] args) {
        List<String> employee = new ArrayList<>();
        employee.add("Alexey");
        employee.add("Alexey Kh");
        employee.add("Alexey B");
        employee.add("Irina");
        employee.add("Mikhail");

        try(ObjectOutputStream outputStream =
                new ObjectOutputStream(new FileOutputStream("emp.bin"))) {
            outputStream.writeObject(employee);
            System.out.println("DONE!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}