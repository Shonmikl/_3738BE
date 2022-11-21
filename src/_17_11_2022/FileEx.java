package _17_11_2022;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("raf.txt");
        File folder = new File("C:\\Users\\mikha\\OneDrive\\Рабочий стол\\AAA");
//        System.out.println(file.getAbsolutePath());
//        System.out.println(folder.getAbsolutePath());

//        System.out.println(file.isAbsolute());
//        System.out.println(folder.isAbsolute());

        System.out.println(file.isDirectory());
        System.out.println(folder.isDirectory());
    }
}