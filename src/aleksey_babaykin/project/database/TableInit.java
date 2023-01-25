package aleksey_babaykin.project.database;

import java.io.*;

public abstract class TableInit {
    static <M> void saveMap(M map, String fileNameTable) {
        File file = new File(fileNameTable);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(map);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static <M> M readMap(String fileName) {
        M tempHashMap = null;
        File file = new File(fileName);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            tempHashMap = (M) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return tempHashMap;
    }
}