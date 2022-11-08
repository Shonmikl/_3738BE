package src.alexandr_sapunov.homeWork_08112022;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Employees> employeesList = new ArrayList<>();
        Employees emp1 = new Employees("Stepan", 34, 'm', "Director", 34000);
        Employees emp2 = new Employees("Adolf", 666, 'm', "Herder ", 50000);
        Employees emp3 = new Employees("Vladimir", 25, 'm', "Assistant", 20000);
        Employees emp4 = new Employees("Rosa", 18, 'w', "Blogger", 100000);
        Employees emp5 = new Employees("Eleanor", 43, 'w', "Cook", 19000);
        Employees emp6 = new Employees("Zeus", 50, 'b', "Pilot", 30000);
        Employees emp7 = new Employees("Matilda", 30, 'w', "Doctor", 30000);
        Employees emp8 = new Employees("Luna", 28, 'w', "Nurse", 25000);
        Employees emp9 = new Employees("Thor", 60, 'b', "Cleaner", 1200);
        employeesList.add(emp1);
        employeesList.add(emp2);
        employeesList.add(emp3);
        employeesList.add(emp4);
        employeesList.add(emp5);
        employeesList.add(emp6);
        employeesList.add(emp7);
        employeesList.add(emp8);
        employeesList.add(emp9);
        int[] arrInt = {2, 48, 23, 7, 6, 5, 98, 23, 47, 6, 7, 73, 14, 1, 54, 32, 25, 20, 19, 67, 100, 66, 342, 89, 23, 46, 6, 17, 19, 73, 94, 68, 13, 11};
        List<String> stringList = Stream.of("Кинолог", "Врачь", "Дантист", "Юрист", "Програмист", "Преподаватель",
                "Уборщик", "Водитель", "Юрист", "Касссир", "Повар", "Инженер", "Строитель", "Бухгалтер", "Дизайнер", "Косметолог"
                , "Пожарный", "Механик", "Фотограф", "Сварщик", "Переводчик", "Мамолог", "Банкиир").collect(Collectors.toList());
        List<Integer> integerList = Stream.of(66, 13, 1, 54, 87, 9, 10, 11, 16, 23, 27, 43, 34, 19, 13, 12, 21, 35, 37, 76, 67, 45, 42,
                39, 56, 78, 90, 100, 54, 6, 8, 9, 2, 32, 35, 36, 39, 58, 67, 36, 49, 54, 63, 28, 29, 40, 34, 54, 55).collect(Collectors.toList());

        int[] arr1 = Arrays.stream(arrInt)
                .filter(el -> el % 2 == 0)     // фильтрует по принципу
                .map(el -> el * 2)           // работает с каждым елементом
                .distinct()               // убирает дубликаты
                .sorted()                 // сортирует
                .skip(3)               // пропускает
                .toArray();               // собирает
        System.out.println("arr1 " + Arrays.toString(arr1));

        System.out.println("Сумма всех елементов массива arrInt с помощью reduce со стартовым значением 6 =" +
                Arrays.stream(arrInt).reduce(6,(acc,el)->acc +el));

        System.out.println("Поиск максимального Элемента при помощи max =" +
                Arrays.stream(arrInt).max().getAsInt());

        System.out.println("Поиск минимального Элемента при помощи min =" +
                Arrays.stream(arrInt).min().getAsInt());

        System.out.println("Поиск суммы всех элементов при помощи sum =" +
                Arrays.stream(arrInt).sum());

        List<Integer> ListForAllMath  = Arrays.asList(2,4,8,16,32);
        boolean result = ListForAllMath.stream()
                .peek(System.out::println)       //позволяет нам увидеть с какими мы элементами работаем
                .allMatch(el ->el%2 ==0);
        System.out.println("Result from AllMath = " + result);
        //allMath - проверяет, что каждый элемент из этого списка подходит описанию (true)
        //anyMath - проверяет, что хотябы один элемент подходит описанному критерию
        //noneMath - проверяет, что не на одном елементе данное условие не будет выполнятся

        employeesList.stream()
                .filter(el-> el.getAge()>26)
                .filter(el -> el.getSex() =='m')
                .limit(3)
                .forEach(System.out::println);
    }
}