package aleksey_babaykin.project.database;

import aleksey_babaykin.project.Variables;
import aleksey_babaykin.project.models.data.InstanceFile;
import aleksey_babaykin.project.models.data.PropertyTypeFile;
import aleksey_babaykin.project.util.ID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class TableFiles extends TableInit implements Serializable {
    // there is an information about file

    private static final String FILE_DB = "TableFiles.bin";
    private static final String FILE_DOCFILE_DB = "TableIdInstanceIdFiles.bin";

    public static Map<String, String> mapInstanceDocIdFiles = new HashMap<>(); // idInstance Document + Id File
    public static Map<String, InstanceFile> mapFiles = new HashMap<>();


    public static String addDocFile(String idInstanceDoc) {
        String idFile = ID.getUniqueId(mapInstanceDocIdFiles);
        TableFiles.mapFiles.put(idFile, PropertyTypeFile.addFile(idFile));
        TableFiles.mapInstanceDocIdFiles.put(idInstanceDoc, idFile);
        return idFile;
    }

    public static String getIdFile(String idInstanceDoc) {
        if (mapInstanceDocIdFiles.containsKey(idInstanceDoc)) {
            return mapInstanceDocIdFiles.get(idInstanceDoc);
        }
        return null;
    }

    public static InstanceFile getFileInfo(String idInstanceDoc) {
        if (mapInstanceDocIdFiles.containsKey(idInstanceDoc)) {
            String tmpIdFile = mapInstanceDocIdFiles.get(idInstanceDoc);
            if (mapFiles.containsKey(tmpIdFile)) {
                return mapFiles.get(tmpIdFile);
            }
        }
        return null;
    }

    public static InstanceFile getFileInfoAndContent(String idInstanceDoc) {
        String tmpIdFile = getIdFile(idInstanceDoc);
        InstanceFile instanceFile = getFileInfo(idInstanceDoc);
        PropertyTypeFile.loadFile(tmpIdFile, instanceFile);
        return instanceFile;
    }

    public static void saveMapToFile() {
        saveMap(TableFiles.mapFiles, Variables.DIRECTORY_DB + TableFiles.FILE_DB);
        saveMap(TableFiles.mapInstanceDocIdFiles, Variables.DIRECTORY_DB + TableFiles.FILE_DOCFILE_DB);
    }

    public static void readMapFromFile() {
        TableFiles.mapFiles = readMap(Variables.DIRECTORY_DB + TableFiles.FILE_DB);
        TableFiles.mapInstanceDocIdFiles = readMap(Variables.DIRECTORY_DB + TableFiles.FILE_DOCFILE_DB);

        if (mapFiles == null) {
            mapFiles = new HashMap<>();
        }
        if (mapInstanceDocIdFiles == null) {
            mapInstanceDocIdFiles = new HashMap<>();
        }
    }
}