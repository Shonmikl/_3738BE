package alexey_lavrov.hm_05112022;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {
        // INIT
        int[] arrayInt = {3, 5, 54, 87, 98, 65, 46, 87, 65, 4, 1, 87, 9, 87, 96, 84, 63, 51, 37, 98, 76, 35, 41, 68, 79, 76, 54, 63, 79};
        List<Integer> intList = Stream.of(12, 27, 33, 46, 54, 64, 87, 98, 46, 56, 49, 78, 94, 65, 48, 79, 84, 65, 46, 54, 61, 32, 13, 46, 32, 13, 54, 32, 13, 5).toList();
        List<String> strList = Stream.of("Юлия", "Юлия", "Юлия", "Агата", "Вячеслав", "Василиса", "Анна", "Тимофей", "Георгий", "Арсений", "Марьяна", "София", "Майя", "Алиса", "Артём", "Виктория", "Матвей", "Елизавета", "Демид", "Роберт", "Егор", "Злата", "Кирилл", "Максим", "Алина", "Даниил", "Илья", "Андрей", "Анна", "Ульяна", "Кристина", "Владислав", "Валерия", "Артемий", "Данила", "Сергей", "Давид", "Евдокия", "Михаил", "Мария", "Константин", "Маргарита", "Роман", "Никита", "Пётр", "Мирон", "Мия", "Алексей", "Анастасия", "Александра", "Леонид", "Дмитрий", "Марк").toList();
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "Michail", true, Countries.Germany, 38));
        userList.add(new User(2, "Vasiliy", false, Countries.UA, 12));
        userList.add(new User(3, "Alexey", true, Countries.Germany, 38));
        userList.add(new User(4, "Vitaliy", false, Countries.UA, 22));
        userList.add(new User(5, "Vika", false, Countries.Germany, 21));
        userList.add(new User(6, "Nik", true, Countries.USA, 12));
        userList.add(new User(7, "Agata", false, Countries.USA, 32));
        // ---------------

        Arrays.stream(arrayInt)
                .filter(el -> el < 50)
                .map(el -> el * 10)
                .sorted()
                .forEach(System.out::println);

        System.out.println("\n\n  -->Int list stream:");
        intList.stream()
                .filter(el -> el % 3 == 0)
                .map(el -> el > 50 ? el * 10 : el)
                .sorted((a, b) -> b - a)
                .distinct() // оставляем только уникальные элементы
                .forEach(System.out::println);

        System.out.println("\n  -->String list stream:");
        strList.stream()
                .filter(el -> el.length() < 5)
                .map(el -> el.toUpperCase() + " : ")
                .sorted()
                .distinct()
                .forEach(System.out::print);

        System.out.println("\n\n  -->String Group list stream:");
        Map<Countries, List<User>> grouping = userList.stream()
                .collect(groupingBy(User::getCountry));

        for (Map.Entry<Countries, List<User>> item : grouping.entrySet()) {
            System.out.println("--" + item.getKey() + ":");
            for (User user : item.getValue()) {
                System.out.println(user.getName());
            }
            System.out.println();
        }
        System.out.println(userList.stream()
                .collect(groupingBy(User::getCountry, Collectors.counting())));

        System.out.println("\n\n  -->User list stream:");
        userList.stream()
                .filter(el -> !el.isAdmin())
                .map(el -> {
                    el.setAdmin(true);
                    return el;
                })
                .peek(el -> el.setAge(el.getAge() + 5))               /// TODO: УТОЧНИТЬ!!!!!
                .sorted((a, b) -> b.getAge() - a.getAge())
                .forEach(System.out::print);

        System.out.println("\n\n  -->Int list stream (skip && limit,min, max):");
        System.out.println("min:" + intList.stream()
                .skip(10)
                .limit(3)
                .min(Comparator.comparingInt(o -> o)));

        System.out.println("max:" + intList.stream()
                .skip(10)
                .limit(3)
                .max(Comparator.comparingInt(o -> o)));

        System.out.println("\n\n  -->FlatMap stream :");
        userList.stream()
                .skip(2)
                .limit(2)
                .flatMap(user -> Stream
                        .of(
                                String.format("%s:  now Age - %d", user.getName(), user.getAge()),
                                String.format("%s:  Age after some years - %d", user.getName(), (user.getAge() + (int) (new Random()).nextInt(20)))
                        ))
                .forEach(System.out::println);

        System.out.println("\n\n -->Stream (allMatch, anyMatch):");
        System.out.println("Is all 18+:" + userList.stream()
                .allMatch(user -> user.getAge() >= 18));
        System.out.println("Is someone Admin:" + userList.stream()
                .anyMatch(User::isAdmin));

        int[] newIntArr = new Random().ints(20, 0, 50)
                .toArray();
        // преобразовываем поток примитивных типов в поток объектов
        Stream<Integer> integerStream = Arrays.stream(newIntArr).boxed();
        Integer[] integerArray = integerStream.toArray(Integer[]::new);
        System.out.println(Arrays.stream(integerArray).findFirst());

        System.out.println(Arrays.stream(Arrays.stream(newIntArr).boxed().toArray(Integer[]::new)).findFirst());


        System.out.println("Sum int array:" + Arrays.stream(newIntArr).sum());
        System.out.println("Sum Integer array:" + Arrays.stream(integerArray).mapToInt(i -> i).sum());

        System.out.println("AVR int array:" + Arrays.stream(newIntArr).average());
        System.out.println("AVR Integer array:" + Arrays.stream(integerArray).mapToInt(integer -> integer).average());

        // partitioningBy - Alexey Khudoshin готовит объяснение с примерами что этот метод делает
        // reverseOrder
        // parallelStream


        /*
          TODO:
              Дано: Stream.of("Linux", "Windows", "Mac")
              Надо: Объединение нескольких строк в одну
         */
        System.out.println();
        System.out.println(Stream.of("Linux", "Windows", "Mac").reduce((s, s2) -> s + '|' + s2));


        /*
         * TODO:
         *  Дано:
         *  List<String> fruits = Stream.of("apple", "banana", "lemon", "orange")
         *  Надо: преобразовать стрим из строк в мапу, причём ключом сделать первую букву соответствующего слова
         *  На выходе должно быть: {a=apple, b=banana, l=lemon, o=orange}
         */
        List<String> fruits = Stream.of("apple", "banana", "lemon", "orange").toList();
        Map<Character,String> map = fruits.stream().collect(Collectors.toMap(s -> s.charAt(0),s -> s));
        System.out.println(map);
    }
}
