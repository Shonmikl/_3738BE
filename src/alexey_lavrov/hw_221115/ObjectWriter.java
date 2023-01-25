package alexey_lavrov.hw_221115;


import java.io.*;

public class ObjectWriter {

    public static String saveObj(Object obj) throws FileNotFoundException {
        String name = obj.hashCode() + ".bin";
        try (ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream(name))){
            ooStream.writeObject(obj);
            return name;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
