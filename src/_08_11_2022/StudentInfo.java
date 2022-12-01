package _08_11_2022;

import _03_11_2022.students.Student;

import java.util.ArrayList;

public class StudentInfo {
    void testStudent(ArrayList<Student> al, StudentCheck sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Student s1 = new _03_11_2022.students.Student("Sergey", 'm', 22, 3, 8.3);
        Student s2 = new _03_11_2022.students.Student("Nik", 'm', 28, 2, 7.4);
        Student s3 = new _03_11_2022.students.Student("Elena", 'w', 32, 1, 9.0);
        Student s4 = new _03_11_2022.students.Student("Petr", 'm', 30, 4, 6.0);
        Student s5 = new _03_11_2022.students.Student("Marya", 'w', 25, 5, 7.7);

        ArrayList<Student> student = new ArrayList<>();
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        student.add(s5);

        StudentInfo info = new StudentInfo();
        info.testStudent(student, s -> s.getAge() < 30);

    }
}

@FunctionalInterface
interface StudentCheck {
    boolean check(Student s);
}

class CheckOverGrade implements StudentCheck {

    @Override
    public boolean check(Student s) {
        return s.getAvgGrade() > 8;
    }
}