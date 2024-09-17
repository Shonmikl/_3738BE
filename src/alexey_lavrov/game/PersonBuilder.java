package alexey_lavrov.game;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class PersonBuilder {
    public static List<Person> generate(int count, Exchanger<Person> exchanger) {
        Faker faker = new Faker();
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            personList.add(i, new Person(faker.name().firstName(), exchanger));
        }
        return personList;
    }
}