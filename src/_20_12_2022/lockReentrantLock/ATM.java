package _20_12_2022.lockReentrantLock;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Alexey", lock);
        new Employee("Mikhail", lock);
        new Employee("Irina", lock);
        Thread.sleep(1000);
        new Employee("Marija", lock);
        new Employee("Pavel", lock);
        new Employee("Elena", lock);
        new Employee("Vera", lock);
    }
}


@ToString
class Employee extends Thread {
    String name;
    Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }


    public void run() {
        if (lock.tryLock()) {
            try {
//                System.out.println(name + "..is waiting for...");
//                lock.lock();
                System.out.println(name + " is using the ATM");
                Thread.sleep(500);
                System.out.println(name + " done!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " doesn't want to wait the ATM");
        }
    }

}
