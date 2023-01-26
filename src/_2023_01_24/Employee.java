package _2023_01_24;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ToString
@SuperAnnotation
@AllArgsConstructor
public class Employee implements Serializable {

    @SuperAnnotation
    String name;
    double salary;

    @SuperAnnotation
    void increaseSalary() {
        salary *= 3;
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@interface SuperAnnotation {

}