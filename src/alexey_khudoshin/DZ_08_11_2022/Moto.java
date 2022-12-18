package DZ_08_11_2022;

import java.util.*;
import java.util.stream.Collectors;


public class Moto {
    private String name;
    private int age;
    private String color;
    private int power;
    private byte cylinder;

    public Moto(String name, int age, String color, int power, byte cylinder) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.power = power;
        this.cylinder = cylinder;
    }

    public Moto(String name, int age, String color, int power, int cylinder) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public byte getCylinder() {
        return cylinder;
    }

    public void setCylinder(byte cylinder) {
        this.cylinder = cylinder;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", cylinder=" + cylinder +
                '}';
    }

    public static void main(String[] args) {
        int[] engineVolumeArr = new int[]{125, 350, 650, 750};

        ArrayList<String> nameMoto = new ArrayList<String>();
        nameMoto.add("Minsk");
        nameMoto.add("Jawa");
        nameMoto.add("MT");
        nameMoto.add("Ural");
        for (int i = 0; i < nameMoto.size(); i++) {
            System.out.println(nameMoto.get(i));
        }
        ArrayList<Integer> ageMoto = new ArrayList<>();
        ageMoto.add(46);
        ageMoto.add(49);
        ageMoto.add(45);
        ageMoto.add(42);

// Фильтруем моты по имени, начинающиеся с "М"
        String filteredNameList = nameMoto.stream()
                .filter(entry -> entry.startsWith("M"))
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(filteredNameList);

//FOREACH: увеличиваем значение каждого элемента массива engineVolumeArr на 50
        int[] newEngineVolume = new int[4];
        System.out.println("new volume engine:");
        for (int i : newEngineVolume) {
            newEngineVolume[i] = engineVolumeArr[i] + 50;
            System.out.print(" " + newEngineVolume[i]);
        }

//  The partitioningBy(predicate) метод возвращает Collector который разбивает входные элементы
//  в соответствии с заданным Predicate, и организует их в Map<Boolean, List<T>>
//        The Collectors.partitioningBy() {"Разбиение по"} метод возвращает сборщик, который может разбить список в соответствии
//        с предоставленным предикатом и организовать список в Map<Boolean, List<T>>.
//        Его можно использовать для разделения списка на два подсписка в зависимости от того, совпал ли предикат
//        ПРЕДИКА́Т (Мужской род): понятие, определяющее предмет суждения — субъект.

        int etalonZrelosti = 46;
        Map<Boolean, List<Integer>> map = ageMoto.stream()
                .collect(Collectors.partitioningBy(e ->
                        ageMoto.indexOf(e) > etalonZrelosti));
        System.out.println(map);

        List<List<Integer>> lists = new ArrayList<>(map.values());

        System.out.println("This moto is so young: " + lists.get(0));
        System.out.println("This moto is so mature " + lists.get(1));


//        FlatMap
//<R>  Stream <R> flatMap( Function <? super T ,? extends Stream <? extends R>> mapper)
//Возвращает поток (stream), состоящий из результатов замены каждого элемента этого потока содержимым сопоставленного
// потока, полученного путем применения предоставленной функции сопоставления к каждому элементу.
// Каждый отображаемый поток создается closed после того, как его содержимое было помещено в этот поток.
// (Если сопоставленный поток является null пустым, вместо него используется пустой поток.)
//Это промежуточная операция.
//Примечание API:
//Результатом flatMap()операции является применение преобразования «один ко многим» к элементам потока,
// а затем сведение результирующих элементов в новый поток.
//Примеры.
//Если orders это поток заказов на покупку, и каждый заказ на покупку содержит набор позиций,
// то следующее создает поток, содержащий все позиции во всех заказах:
////
//     orders.flatMap(order -> order.getLineItems().stream())...
//
//Если path это путь к файлу, то следующее создает поток, words содержащийся в этом файле:
//
//     Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8);
//     Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" +")));
//
//Переданная mapper-функция flatMap разбивает строку с помощью простого регулярного выражения на массив слов,
// а затем создает поток слов из этого массива.
//Параметры типа:
//R- Тип элемента нового потока
//Параметры:
//mapper- не вмешивающаяся функция без сохранения состояния для применения к каждому элементу,
// который создает поток новых значений
//Возвращает:
//новый поток

        String Minsk = null;
        String Jawa = null;
        String MT = null;
        String Ural = null;
        String red = null;
        String black = null;
        String green = null;

        Moto mot1 = new Moto(Minsk, 46, red, 11, 1);
        Moto mot2 = new Moto(Jawa, 49, red, 18, 2);
        Moto mot3 = new Moto(MT, 45, black, 30, 2);
        Moto mot4 = new Moto(Ural, 42, green, 36, 2);

        Map<Integer, String> bikes = new HashMap<>();
        bikes.put(1, mot1.getName());
        bikes.put(2, mot2.getName());
        bikes.put(3, mot3.getName());
        bikes.put(4, mot4.getName());

        System.out.println(bikes);
    }

}

