package _15_11_2022;

import java.io.*;
// Для чтения и записи бинарных файлов
public class FileInputStreamAndFileOutPutStream {
    public static void main(String[] args) {
//        try(BufferedReader reader = new BufferedReader(new FileReader("E:\\_3738BE\\java.png"));
//            BufferedWriter writer = new BufferedWriter(new FileWriter("new.png"))) {
//            int c;
//            while((c=reader.read()) != -1) {
//                writer.write(c);
//            }
//            System.out.println("DONE!!");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } //не сработает, тк FileReader and FileWriter не предназначен для чтения бинарных файлов
        try (FileInputStream inputStream = new FileInputStream("E:\\_3738BE\\java.png");
             FileOutputStream outputStream = new FileOutputStream("new22.png")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("DONE!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}