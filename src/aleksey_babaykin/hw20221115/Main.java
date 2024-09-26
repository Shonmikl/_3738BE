package aleksey_babaykin.hw20221115;

import _15_11_2022.FileReaderEx;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        fileFileReader();
        bufferedReader();
    }

    public static void fileFileReader(){
        System.out.println("1) FileWriter + FileReade : ");
        String str = "jas ;fja [fefe ej \n ;akf ;fio;fkkqer foiewj \n eijjrf ;ewrngf ;mdvpeor;jng er;j";

        String s = "efwqrwq";
        try (FileWriter fileWriter = new FileWriter("1.txt")){
            fileWriter.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileReader fileReader = new FileReader("1.txt")){
            char[] chars = new char[1000];
            StringBuilder sb =new StringBuilder();

            while (fileReader.read(chars)>=0){
                sb.append(String.valueOf(chars).trim());
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Done !!!");
    }

    public static void  bufferedReader(){
        System.out.println("2) BufferedWriter + BufferedReader : ");
        String str = "jas ;fja [fefe ej \n ;akf ;fio;fkkqer foiewj \n eijjrf ;ewrngf ;mdvpeor;jng er;j";

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter("1.txt"))){
            fileWriter.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader("1.txt"))){
            while ( fileReader.ready()){
                System.out.println(fileReader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Done !!!");
    }
}
