package aleksey_babaykin.project.models.data;

import aleksey_babaykin.project.Variables;
import aleksey_babaykin.project.util.InitLoad;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.*;

@Getter
@Setter
@NoArgsConstructor
public class PropertyTypeFile {
    public static InstanceFile addFile(String idFile){
        InstanceFile tmpInstanceFile = new InstanceFile();
        tmpInstanceFile.setLoadFileName(InitLoad.createFile());

        File fileIn = new File(new StringBuilder()
                .append(Variables.DIRECTORY_INIT)
                .append(tmpInstanceFile.getLoadFileName())
                .toString());
        File fileOut = new File(new StringBuilder()
                .append(Variables.DIRECTORY_FILE)
                .append(idFile)
                .toString());

        try (FileInputStream fileInputStream = new FileInputStream(fileIn);
             FileOutputStream fileOutputStream = new FileOutputStream(fileOut)){
            byte[] readBuffer = new byte[Variables.BUFFER_SIZE_READ_FILE];
            while(fileInputStream.read(readBuffer) > 0){
                fileOutputStream.write(readBuffer);
            }
            tmpInstanceFile.setLoadSize(fileIn.length());
            fileIn.delete();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return tmpInstanceFile;
    }
    public static String loadFile(String idFile, InstanceFile instanceFile){ // return file initial name

        File fileIn = new File(new StringBuilder()
                .append(Variables.DIRECTORY_FILE)
                .append(idFile)
                .toString());
        File fileOut = new File(new StringBuilder()
                .append(Variables.DIRECTORY_DOWNLOAD)
                .append(instanceFile.getLoadFileName())
                .toString());
        try (FileInputStream fileInputStream = new FileInputStream(fileIn);
             FileOutputStream fileOutputStream = new FileOutputStream(fileOut)){
            byte[] readBuffer = new byte[Variables.BUFFER_SIZE_READ_FILE];
            while(fileInputStream.read(readBuffer) > 0){
                fileOutputStream.write(readBuffer);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return instanceFile.getLoadFileName();
    }
}