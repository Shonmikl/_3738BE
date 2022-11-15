package _15_11_2022;

import java.io.*;

/**
 * Обертка для буферизации
 */
public class BufferedEx {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("fw1.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("fw2.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }
            System.out.println("DONE!!!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
