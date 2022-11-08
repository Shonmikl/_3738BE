package _03112022.streams;

import _03112022.students.Faculty;
import _03112022.students.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        Student s1 = new Student("Sergey", 'm', 22, 3, 8.3);
        Student s2 = new Student("Nik", 'm', 28, 2, 7.4);
        Student s3 = new Student("Elena", 'w', 32, 1, 9.0);
        Student s4 = new Student("Petr", 'm', 30, 4, 6.0);
        Student s5 = new Student("Marya", 'w', 25, 5, 7.7);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        Faculty f1 = new Faculty("C++");
        Faculty f2 = new Faculty("JAVA");

//        f1.addStOnF(s1);
//        f1.addStOnF(s2);
//        f1.addStOnF(s3);
//        f2.addStOnF(s4);
//        f2.addStOnF(s5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

//        facultyList.stream()
//                .flatMap(faculty -> faculty.getStudentsOnFaculty()
//                        .stream())
//                .forEach(el-> System.out.println(el.getName()));


        Stream<Student> studentStream = Stream.of(s1, s2, s3, s4, s5);

        List<Student> arrayList = studentList.stream()
                .filter(e -> e.getAvgGrade() > 7 && e.getAvgGrade() < 8)
                .collect(Collectors.toList());

        List<Student> arrayList3 = studentList.stream().collect(Collectors.toList());


        //System.out.println(arrayList);

        //вернуть все что делиться на 3.....нацело
        int[] ints = {45, 6, 9, 88, 12, 36, 54, 12, 36, 5, 4, 98, 76, 55};

        //Arrays.stream(ints).forEach(System.out::println);

        List<Integer> list1 = new ArrayList<>();

        for (int anInt : ints) {
            if (anInt % 3 == 0) {
                list1.add(anInt);
            }
        }
        // System.out.println(studentList);

        int[] arr11 = Arrays.stream(ints).map(el -> el * 10).toArray();
        //System.out.println(Arrays.toString(arr11));
        //map берет элемент и делает с ним че хочет

        //{45, 6, 9, 88, 12, 36, 54, 12, 36, 5, 4, 98, 76, 55};

        int res = Arrays.stream(ints)
                .filter(el -> el % 3 == 0)
                .map(el -> el * 10)
                .reduce(4, Integer::sum);
        //System.out.println(res);

        int[] sort = Arrays.stream(ints)
                .sorted()
                .toArray();

        //System.out.println(Arrays.toString(sort));

        //сделать все имена заглавными
        //отфильтровать по полу
        //сортировка по возрасту
        //вывести на экран

//        studentList.stream()
//                .filter(el->el.getSex() == 'm')
//                .map(el->{
//                    el.setName(el.getName().toUpperCase());
//                    return el;
//                })
//                .sorted((a, b)->a.getAge() - b.getAge())
//                .forEach(System.out::println);

//        Map<Boolean, List<Student>> map =
//                studentList.stream()
//                        .collect(Collectors.partitioningBy(el->el.getAvgGrade()>7));
//
//        for (Map.Entry<Boolean, List<Student>> entry: map.entrySet() ) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        Student min = studentList.stream().min(Comparator.comparingInt(Student::getSex)).get();
        Student max = studentList.stream().max(Comparator.comparingInt(Student::getCourse)).get();

        //System.out.println(min);
        studentList.stream()
                .filter(el->el.getAge()>22)
                .skip(0)
                .limit(2)
                .forEach(System.out::println);
    }
}