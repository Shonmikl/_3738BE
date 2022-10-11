package _11102022;
//Инкапсуляция!! == сокрытие реализации
//Полиморфизм
//Абстракция
//Наследование

import java.io.File;

public class Hero {
    private String name;
    private int age;
    private double d;
    byte b;

    //default == package private
    float f;

    private static void walk(String s) {
    }
//function == methods
    public void say() {

        //логика.....
        String s1 = "";
        walk(s1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Main {
    public static void main(String[] args) {
        //data type  name  = create object  constructor
            Hero      hero =   new           Hero();

    }
}