package _15_11_2022;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//для чтения текстовых файлов
public class FileReaderEx {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("fw1.txt")){
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);

            }
            System.out.println();
            System.out.println("DONE!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}