package _20_12_2022.daemon;

public class DaemonEx1 {
    public static void main(String[] args) {
        System.out.println("Main() thread start");

        UserThread userThread = new UserThread();
        userThread.setName("User Thread");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("Daemon Thread");

        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();

        System.out.println("Main() ends");
    }
}

class UserThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon = " + isDaemon());
        for (char i = 'A'; i < 'Z'; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon = " + isDaemon());
        for (int i = 1; i < 500; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}