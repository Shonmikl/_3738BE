package _2023_01_19.calc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum is: " + result);
    }

    void minus(int a, int b) {
        int result = a - b;
        System.out.println("Minus: " + result);
    }

    void multi(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication is: " + result);
    }

    void division(int a, int b) {
        int result = a / b;
        System.out.println("Division is: " + result);
    }
}

class TestCalculator {
    public static void main(String[] args)
            throws InvocationTargetException, IllegalAccessException {
        try (BufferedReader reader = new BufferedReader(new FileReader("calc.txt"))) {
            String methodName = reader.readLine();
            String firstArg = reader.readLine();
            String secondArg = reader.readLine();

            Calculator calculator = new Calculator();
            Class c1 = calculator.getClass();
            Method method = null;

            Method[] methods = c1.getDeclaredMethods();
            for (Method m : methods) {
                if(m.getName().equals(methodName)) {
                    method = m;
                }
            }

            method.invoke(calculator, Integer.parseInt(firstArg), Integer.parseInt(secondArg));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}