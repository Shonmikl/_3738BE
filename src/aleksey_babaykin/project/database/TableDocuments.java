package aleksey_babaykin.project.database;

import aleksey_babaykin.project.Variables;
import aleksey_babaykin.project.models.data.InstanceDocument;
import aleksey_babaykin.project.models.data.PropertyCustomType;
import aleksey_babaykin.project.models.data.PropertyCustomTypeDocument;
import aleksey_babaykin.project.models.interfaces.CommonCustomerType;
import aleksey_babaykin.project.util.ID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class TableDocuments extends TableInit implements Serializable {
    // There is an information:
    // 1) Document definition --- it will be created
    // 2) Structure of files   --- it will be created
    // 3) Properties of stored files

    private static final String FILE_DB = "TableDocClass.bin";
    public static Map<String, InstanceDocument> mapDocuments = new HashMap<>();

    public static String addInstanceDocument(String idClass, String idVersion, PropertyCustomType propertyCustomType) {
        String id = ID.getUniqueId(mapDocuments);

        InstanceDocument instanceDocument = TableDocuments.getInstanceVersionByID(idVersion);
        Map<String, CommonCustomerType> mapCustomParams = PropertyCustomTypeDocument.getMapCustomerParams(
                TableDocClass.getFieldsMap(idClass),
                instanceDocument.getPropertyCustomTypeDocument().getPropertiesCustom(),
                propertyCustomType.getPropertiesCustom());
        int tempNumbVer = instanceDocument == null ? 0 : instanceDocument.getVersionNumber();
        LocalDateTime tempLocDatTime = instanceDocument == null ? null : instanceDocument.getCreateDate();

        TableDocuments.mapDocuments.put(id, new InstanceDocument(idClass, idVersion, tempLocDatTime, ++tempNumbVer, mapCustomParams));
        if (instanceDocument != null) {
            instanceDocument.setLastVersion(false);
        }
        return id;
    }

    private static InstanceDocument getInstanceVersionByID(String idVersion) {
        return mapDocuments
                .entrySet()
                .stream()
                .filter((k) -> (k.getValue().getIdVersion().equals(idVersion) && k.getValue().isLastVersion()))
                .toList()
                .get(1)
                .getValue();
    }

    public static void saveMapToFile(){
        TableDocuments.saveMap(TableDocuments.mapDocuments, Variables.DIRECTORY_DB+TableDocuments.FILE_DB);
    }

    public static void readMapFromFile(){
        TableDocuments.mapDocuments = TableDocuments.readMap(Variables.DIRECTORY_DB+TableDocuments.FILE_DB);
        if (TableDocuments.mapDocuments == null) {
            TableDocuments.mapDocuments = new HashMap<>();
        }
    }
}