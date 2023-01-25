package alexey_lavrov.project.services;

import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

@UtilityClass
public class SaveFile {

    public static <T> String saveList(ArrayList<T> list){
        String name =  list.hashCode() + ".bin";
        try (ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream(name))){
            ooStream.writeObject(list);
            return name;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> ArrayList<T> readList(String fileName) {
        try (ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream(fileName))){
            return (ArrayList<T>) oiStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static String saveObj(Object obj) {
        String name = obj.getClass().getName() + obj.hashCode() + ".bin";
        try (ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream(name))){
            ooStream.writeObject(obj);
            return name;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createNameList() throws IOException {
        Faker faker = new Faker();
        try(FileWriter fileWriter = new FileWriter("names.txt")) {
            fileWriter.write(faker.funnyName().name() + "\n");
        }
    }

    public static String getNameFromFile() {
        Random rnd = new Random();
        try (BufferedReader bfrReader = new BufferedReader(new FileReader("names.txt"))) {
            return bfrReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
