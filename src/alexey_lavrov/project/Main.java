package alexey_lavrov.project;

import alexey_lavrov.project.models.*;
import alexey_lavrov.project.services.SaveFile;
import alexey_lavrov.project.util.Generator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Bee> beeList = new ArrayList<>();
        ArrayList<Bee> newBeeList;

         for (int i = 0; i < 10; i++) {
            beeList.add(Generator.makeBee(AdultWorkerBee.class));
            beeList.add(Generator.makeBee(YoungWorkerBee.class));
        }
        String fileName = SaveFile.saveList(beeList);
        newBeeList = SaveFile.readList(fileName);
        newBeeList.forEach(System.out::println);
    }
}