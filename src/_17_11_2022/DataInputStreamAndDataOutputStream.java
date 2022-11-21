package _17_11_2022;

import java.io.*;

//Класс для чтения примитивов
public class DataInputStreamAndDataOutputStream {
    public static void main(String[] args) {
        try (DataOutputStream outputStream =
                     new DataOutputStream(new FileOutputStream("dataOS.bin"));
             DataInputStream inputStream =
                     new DataInputStream(new FileInputStream("dataOS.bin"))) {

            // outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeLong(120);
            outputStream.writeInt(1234);
            outputStream.writeFloat(456);
            outputStream.writeChar('G');
            outputStream.writeBoolean(true);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readChar());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}