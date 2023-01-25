package _15_11_2022;

import java.io.FileWriter;
import java.io.IOException;

//Для записи текстовых файлов
public class FileWriterEx {
    public static void main(String[] args)  {
        String s = "There have also been reports that FTX suffered a hack, " +
                "taking millions of dollars of crypto from the firm.\n" +
                "\n" +
                "It's a worrying time for individuals who have money in the business.\n" +
                "\n" +
                "In the UK, crypto assets are largely unregulated, and experts and " +
                "financial watchdogs warn there's little protection for consumers.";
       // FileWriter writer1 = new FileWriter("E:\\_3738BE\\fw1.txt");

        try (FileWriter writer = new FileWriter("E:\\_3738BE\\fw1.txt")) {
            for (int i = 0; i < s.length(); i++) {
                writer.write(s.charAt(i));//записываем каждый символ в наш файл
            }

            System.out.println("DONE!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //try (Объявляем класс ресурсы которого надо закрыть) {
    // пишем код }
}
