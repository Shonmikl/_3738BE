package aleksey_babaykin.hw20221108;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.reverseOrder;

@Getter
@Setter
public class EmployeeList {
    public static void main(String[] args) {
        Print print = new Print();
        List<Employee> employees = new ArrayList<>();
        Set<Employee> set = new TreeSet<>();
        
        employees.add(new Employee(5, "Name 5", "Surname 5", 'M', "Position 5"));
        employees.add(new Employee(3, "Name 3", "Surname 3", 'G', "Position 3"));
        employees.add(new Employee(4, "Name 4", "Surname 4", 'M', "Position 4"));
        employees.add(new Employee(1, "Name 1", "Surname 1", 'G', "Position 1"));
        employees.add(new Employee(2, "Name 2", "Surname 2", 'M', "Position 2"));
        employees.add(new Employee(5, "Name 5", "Surname 5", 'M', "Position 5"));

        System.out.println("List of Employees filter: ");
        print.print(employees
                .stream()
                .filter(value -> value.getId() == 5)
                .collect(Collectors.toList()));

        System.out.println("List of Employees - forEach: ");
        employees
                .stream()
                .forEach(item -> System.out.print(item.toString() + " | "));
        System.out.println();

        System.out.println("List of Employees reduce (return a single element): ");
        Print.print(employees
                .stream()
                .reduce( (left,right) -> right.getId() > left.getId() ? right : left)
                .get());

        System.out.println("List of Employees sort: ");
        Print.print(employees
                .stream()
                .sorted((o1, o2) -> o1.getId() - o2.getId())
                .collect(Collectors.toList()));


        System.out.println("List of Employees distinct (group by no sort): ");
        Print.print(employees
                .stream()
                .distinct()
                .collect(Collectors.toList()));

        System.out.println("List of Employees peek : ");
        Print.print(employees
                .stream()
                .peek(item -> Print.print(item.getId()))
                .collect(Collectors.toList()));

        System.out.println("List of Employees flatMap : ");
        Print.print(employees
                .stream()
                .flatMap(item -> Stream.of(item.getName())).
                collect(Collectors.toList()));

        System.out.println("List of Employees groupingBy : ");
        employees
                .stream()
                .collect(Collectors
                        .groupingBy(employee -> employee.getId() % 2))
                .entrySet()
                .forEach(item-> System.out.println("Key :" + item.getKey() + " ---> Value : " + item.getValue().toString()));

        System.out.println("List of Employees skip 5 items: ");
        Print.print(employees
                .stream()
                .skip(5)
                .collect(Collectors.toList()));

        System.out.println("List of Employees findFirst (first in the stream): ");
        Print.print(employees
                .stream()
                .findFirst()
                .get());

        System.out.println("List of Employees min: ");
        Print.print(employees
                .stream()
                .min((o1, o2) -> o1.getId() - o1.getId())
                .get());

        System.out.println("List of Employees max: ");
        Print.print(employees
                .stream()
                .max((o1, o2) -> o2.getId() - o1.getId())
                .get());

        System.out.println("List of Employees sum: ");
        Print.print(employees
                .stream()
                .collect(Collectors.summingInt(value -> value.getId())));

        System.out.println("List of Employees average: ");
        Print.print(employees
                .stream()
                .collect(Collectors.averagingDouble(value -> value.getId())));

        System.out.println("List of Employees anyMatch (matching with 5: ");
        Print.print(employees
                .stream()
                .anyMatch(value -> value.getId() == 5));

        System.out.println("List of Employees anyMatch (return if all elements are in condition): ");
        Print.print(employees
                .stream()
                .allMatch(value -> value.getId() % 2 == 0));

        System.out.println("List of Employees allMatch:");
        Print.print(employees
                .stream()
                .allMatch(value -> value.getId() % 2 == 0));

        System.out.println("List of Employees reverseOrder:");
        Print.print(employees
                .stream()
                .sorted(reverseOrder())
                .collect(Collectors.toList()));

        System.out.println("List of Employees parallel :");
        Print.print(employees
                .stream()
                .parallel()
                .map(item-> {item.setId(item.getId()+5); return item;})
                .collect(Collectors.toList()));
    }
}