package _22_11_2022;

import lombok.AllArgsConstructor;

public class RegexEx5 {
    static void employeeInfo(Employee em) {
        System.out.printf("ID: %03d\t NAME: %-6s\t SURNAME: %-6s\t  SALARY: %,.1f\n",
                em.id, em.name, em.surname, em.salary*(1 + em.bonusPCT));
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Alexey", "Lavrov", 4500, 0.26);
        Employee e2 = new Employee(22, "Alexey", "Khudoshin", 3500, 0.33);
        Employee e3 = new Employee(123, "Alexey", "Babaykin", 4400, 0.27);
        Employee e4 = new Employee(23, "Alexandr", "Sapunov", 4000, 0.22);
        Employee e5 = new Employee(55, "Mikhail", "Egorov", 8000, 0.21);

        employeeInfo(e1);
        employeeInfo(e2);
        employeeInfo(e3);
        employeeInfo(e4);
        employeeInfo(e5);
    }
}

@AllArgsConstructor
class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPCT;
}
