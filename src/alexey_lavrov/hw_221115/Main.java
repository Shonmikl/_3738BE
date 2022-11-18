package alexey_lavrov.hw_221115;

import alexey_lavrov.project.models.Bee;
import alexey_lavrov.project.models.Drone;
import com.github.javafaker.Faker;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        try(BufferedReader bfrReader = new BufferedReader(new FileReader("names.txt"))) {
            String line;
            while ((line = bfrReader.readLine()) != null) {
                Bee bee = new Drone(
                        rnd.nextInt(100),
                        line
                );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        for (int i = 0; i < 16; i++) {
//
//            switch (i) {
//                case 0 -> hiveService.addBeeInHive(
//                        new Queen(
//                                rnd.nextInt(100),
//                                faker.address().firstName(),
//                                faker.date().birthday(),
//                                rnd.nextFloat(3),
//                                rnd.nextBoolean()
//                        ));
//                case 1, 2, 3, 4 -> hiveService.addBeeInHive(new Drone(
//                        rnd.nextInt(100),
//                        faker.address().firstName(),
//                        faker.date().birthday(),
//                        rnd.nextFloat(3),
//                        rnd.nextBoolean()
//                ));
//            }
//        }
    }

    public static void createNameList() throws IOException {
        Faker faker = new Faker();
        try(FileWriter fileWriter = new FileWriter("names.txt")) {
            fileWriter.write(faker.funnyName().name() + "\n");
        }
    }
}
