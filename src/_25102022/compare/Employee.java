package _25102022.compare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Employee implements Comparable<Employee> {
    private String name;
    private String surname;
    private int age;
    private int course;

    @Override
    public int compareTo(Employee secondEmployee) {
        int res = this.name.compareTo(secondEmployee.name);
        if (res == 0) {
            res = this.surname.compareTo(secondEmployee.surname);
        }
        return res;
    }
}

class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Integer.compare(emp1.getAge(), emp2.getAge());
    }
}

class SurnameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        //todo
        return 0;
    }
}
//    @Override
//    public int compareTo(Employee secondEmployee) {
//Вар.1       if(this.course == secondEmployee.course) {
//            return 0;
//        } else if (this.course < secondEmployee.course) {
//            return -1;
//        } else {
//            return 1;
//        }

//Вар.2       return Integer.compare(this.course, secondEmployee.course);
//Вар.3        return this.course - secondEmployee.course;
//        return this.course.compareTo(secondEmployee.course);
//    }