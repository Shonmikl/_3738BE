package alexey_lavrov.hw_14112022.parametrized;

import alexey_lavrov.hw_14112022.parametrized.models.*;
import alexey_lavrov.hw_14112022.parametrized.models.comparators.BeeComparator;
import alexey_lavrov.hw_14112022.parametrized.models.interfaces.Flying;
import alexey_lavrov.hw_14112022.parametrized.services.HiveService;
import com.github.javafaker.Faker;

import java.util.Random;
import java.util.stream.Collectors;

//Создать класс с 5 полями разных типов
//Сделать 4 наследника от этого класса так, что бы 2 наследовались от двух
//Имплементировать Comparable на два поля
//Создать для остальных полей Компаратор
//Создать 15 объектов и заполнить их данными
//Сделать отдельный класс БазаДанных которая будет в себе хранить МАПУ
//Ключ = объект, значение сами решите
//Так же в БД будут отсортированный СЭТ Deque Тримап
//В отдельном сервисе сделать метод который будет добавлять объект в БД во все четыре структуры
//Естественно должны быть конструкторы, приват поля геттеры итд
//Естественно все должно быть правильно именовано и разбито оп папкам и по классам
//Интерфейс - с доп опцией должен быть!!!
//Сделать в отдельном проекте
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Faker faker = new Faker();

        FlyingGroup<WorkerBee> generalGroup =  new FlyingGroup<>(1);
        for (int i = 0; i <2; i++) {
            generalGroup.addFlyingMember(new YoungWorkerBee(
                    rnd.nextInt(100),
                    faker.address().firstName()
            ));
        }
        FlyingGroup<WorkerBee> adultGroup = new FlyingGroup<>(2);
        for (int i = 0; i < 5; i++) {
            generalGroup.addFlyingMember(new AdultWorkerBee(
                    rnd.nextInt(100),
                    faker.address().firstName()
            ));
        }


        generalGroup.addFlyingGroup(adultGroup);
        generalGroup.getFlyingGroup().forEach(System.out::println);

/*        HiveService hiveService = new HiveService();

        for (int i = 0; i < 16; i++) {

            switch (i) {
                case 0 -> hiveService.addBeeInHive(
                        new Queen(
                                rnd.nextInt(100),
                                faker.address().firstName(),
                                faker.date().birthday(),
                                rnd.nextFloat(3),
                                rnd.nextBoolean()
                        ));
                case 1, 2, 3, 4 -> hiveService.addBeeInHive(new Drone(
                        rnd.nextInt(100),
                        faker.address().firstName(),
                        faker.date().birthday(),
                        rnd.nextFloat(3),
                        rnd.nextBoolean()
                ));
                case 5, 6, 7, 8, 9, 10 -> hiveService.addBeeInHive(
                        hiveService.sendBeeToRest(
                                new YoungWorkerBee(
                                        rnd.nextInt(100),
                                        faker.address().firstName(),
                                        faker.date().birthday(),
                                        rnd.nextFloat(2),
                                        rnd.nextBoolean()
                                )));
                default -> hiveService.addBeeInHive(
                        hiveService.sendBeeToRest(
                                new AdultWorkerBee(
                                        rnd.nextInt(100),
                                        faker.address().firstName(),
                                        faker.date().birthday(),
                                        rnd.nextFloat(2),
                                        rnd.nextBoolean()
                                )));
            }

        }


        System.out.println(hiveService.getAllBeeInHive());
//        System.out.println(Collections.sort(new ArrayList<Bee>(hiveService.getAllBeeInHive().entrySet())));
//        System.out.println(hiveService.getAllBeeInHive());
        System.out.println(hiveService.getUniqueTypesOfBee());
        System.out.println("Bee on vocations without sorted:");
        System.out.println(hiveService.getAllBeeOnVocation());
        System.out.println("Bee on vocations sorted:");
        System.out.println(hiveService.getAllBeeOnVocation().stream().sorted(new BeeComparator()).collect(Collectors.toList()));
        System.out.println(hiveService.getTiredBee());
        System.out.println(hiveService.getAllBeeOnVocation());
        System.out.println(hiveService.getRestedBee());
        System.out.println(hiveService.getRestedBee());
        System.out.println(hiveService.getAllBeeOnVocation());

 */
    }
}