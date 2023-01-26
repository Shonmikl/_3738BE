package _2023_01_24;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomi = Class.forName("_2023_01_24.Xiaomi");
        Annotation annotation1 = xiaomi.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println("Annotation info Xiaomi: " + sm1.OS() + " : " + sm1.creationData());

        Class iphone = Class.forName("_2023_01_24.IPhone");
        Annotation annotation2 = iphone.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Annotation info Iphone: " + sm2.OS() + " : " + sm2.creationData());
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS() default "IOS";
    int creationData() default 2023;
}

@SmartPhone(OS = "Android")
class Xiaomi {
    String model;
    double price;
}

@SmartPhone()
class IPhone {
    String model;
    double price;
}