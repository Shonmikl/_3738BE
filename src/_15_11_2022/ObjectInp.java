package _15_11_2022;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInp {
    public static void main(String[] args) {
        List<String> employee;
        try (ObjectInputStream inputStream =
                new ObjectInputStream(new FileInputStream("emp.bin"))){
          employee = (ArrayList) inputStream.readObject();
            System.out.println(employee);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
