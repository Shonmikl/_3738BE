package aleksey_babaykin.project.util;

import aleksey_babaykin.project.Variables;
import aleksey_babaykin.project.database.TableDocClass;
import aleksey_babaykin.project.database.TableDocuments;
import aleksey_babaykin.project.database.TableFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InitLoad {
    public static void checkDir() {
        List<String> list = new ArrayList<>();
        list.add(Variables.DIRECTORY_INIT);
        list.add(Variables.DIRECTORY_FILE);
        list.add(Variables.DIRECTORY_DB);
        list.add(Variables.DIRECTORY_DOWNLOAD);

        File dir;
        for (String item : list) {
            System.out.println(item);
            dir = new File(item);
            if (!dir.exists()) {
                dir.mkdir();
            }
        }

        System.out.println("Step %s: ");
    }

    public static String createFile(){
        Random random = new Random();
        int tmpIndex = random.nextInt(20);
        StringBuilder tmpFileName = new StringBuilder(Variables.FILENAME).append(tmpIndex).append(Variables.FILE_EXTENSION);
        try(FileWriter fileWriter = new FileWriter(Variables.DIRECTORY_INIT + "\\" + tmpFileName)){
            for(int i = 0; i < tmpIndex; i++){
                fileWriter.write(Variables.TEXT + i + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return tmpFileName.toString();
    }
    public static void loadTables(){
//      todo   TableDocClass.readMapFromFile();
//        TableDocuments.readMapFromFile();
//        TableFiles.readMapFromFile();
    }
    public static void saveTables(){
        TableDocClass.saveMapToFile();
        TableDocuments.saveMapToFile();
        TableFiles.saveMapToFile();
    }
}