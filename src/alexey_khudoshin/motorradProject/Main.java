package alexey_khudoshin.motorradProject;

import motorradProject.model.Motorrad;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Motorrad> motorradList = new ArrayList<>();
        motorradList.add(new Motorrad("Honda CBX 1000", 42, "Red", 1047, 225));
        motorradList.add(new Motorrad("Kawasaki Zephyr", 30, "Deep Blue", 1062, 199));
        motorradList.add(new Motorrad("Kawasaki Zephyr", 30, "Deep Blue", 1062, 199));
        motorradList.add(new Motorrad("Yamaha FZR ", 35, "White", 1002, 260));
        motorradList.add(new Motorrad("BMW 1150RT", 22, "Sky Blue", 1130, 204));
        motorradList.add(new Motorrad("KTM Duke 690", 12, "Orange", 690, 193));
        motorradList.add(new Motorrad("harley davidson sportster 883", 2, "Black", 883, 190));
        motorradList.add(new Motorrad("Ducati Monster 1200", 3, "Red", 1193, 250));
        motorradList.add(new Motorrad("Suzuki GSX 1300 R Hayabusa", 13, "Black Gold", 1299, 312));
        motorradList.add(new Motorrad("husqvarna svartpilen 401 ", 1, "Gray", 373, 168));

        List<String> nameMoto = new ArrayList<>();
        for (Motorrad motorrad : motorradList) {
            nameMoto.add(motorrad.getName());
        }
        System.out.println(nameMoto);

        int[] motorVolume = new int[]{1047, 1062, 648, 1002, 1130, 690, 883, 1193, 1299, 373, 1002, 1002};


//        Обрабатываем массив при помощи Stream
        int[] arrSorted = Arrays.stream(motorVolume)  // стримим
                // шось робим:
                .filter(el -> el > 600)    //фильтр: оставляет в массиве элементы массива со значением более 600
                .map(el -> el + 200)          // к каждому элементу добавляется 200
                .distinct()                 // удаляет из массива дубликаты
                .sorted()                   // сортируем
                .skip(2)                 // пропускаем первых 2 элемента

                .toArray();                   // собираем
        System.out.println("отсортированный int массив теперь выглядит так " + Arrays.toString(arrSorted));
        System.out.println();

        List<Integer> intList = Stream.of(17, 38, 49, 57, 77, 88, 99, 88, 99, 157, 157, 555).toList();
        System.out.println("Отсортированный список Integer: ");
        intList.stream()
                .filter(el -> el > 55)
                .map(el -> el * 10)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        List<String> strList = Stream.of("меня", "укусила", "акула", "когда", "я", "нырял", "в", "океане", "но",
                "я", "оставался", "спокоен", "мне", "нужно", "закончить", "работу", "аквалангисты", "это", "не", "игра").toList();
        System.out.println("Отсортированный список String: ");
        strList.stream()
                .filter(el -> el.length() > 4)
                .map(el -> el + " Манго-Манго")
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        /*
          TODO:
              Дано: Stream.of("Linux", "Windows", "Mac")
              Надо: Объединение нескольких строк в одну
        */
        Stream<String> wordsStream = Stream.of("Linux", "Windows", "Mac");
        Optional<String> collectedString = wordsStream.reduce((x, y) -> x + " " + y);
        System.out.println(collectedString.get());
        System.out.println();

        /*
         * TODO:
         *  Дано:
         *  List<String> fruits = Stream.of("apple", "banana", "lemon", "orange")
         *  Надо: преобразовать стрим из строк в мапу, причём ключом сделать первую букву соответствующего слова
         *  На выходе должно быть: {a=apple, b=banana, l=lemon, o=orange}
         */
        List<String> fruits = Stream.of("apple", "banana", "lemon", "orange").toList();
        Map<Character, String> map = fruits.stream().collect(Collectors.toMap(s -> s.charAt(0), s -> s));
        System.out.println(map);

    }
}