package _12_01_2023;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingEx {
    public static void main(String[] args) {

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);

        Thread producer = new Thread(()-> {
            String[] words = {"Alexey B", "Alexey K", "Alexey L", "Irina", "Mikhail"};

            for (int i = 0; i < words.length && !Thread.interrupted(); i++) {

                try {
                    Thread.sleep(1500);
                    queue.put(words[i]);
                    System.out.println("Producer: put into the queue [" + words[i]
                    + "] elements number is " + queue.size());

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumer = new Thread(()-> {

            StringBuilder sb = new StringBuilder();
            while (!Thread.interrupted()) {

                try {
                    sb.setLength(0);
                    Thread.sleep(4000);
                    sb.append(queue.take());
                    System.out.println("Consumer: processed the word ***" + sb.reverse()
                    + "***  elements number is " + queue.size());

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producer.start();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        consumer.start();
    }
}