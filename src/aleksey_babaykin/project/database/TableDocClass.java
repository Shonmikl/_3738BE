package aleksey_babaykin.project.database;

import aleksey_babaykin.project.Variables;
import aleksey_babaykin.project.models.data.PropertyCustomTypeClass;
import aleksey_babaykin.project.models.interfaces.CommonCustomerType;
import aleksey_babaykin.project.util.ID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class TableDocClass extends TableInit implements Serializable {
    // there is an information about custom fields

    private static final String FILE_DB = "TableDocClass.bin";
    public static Map<String, PropertyCustomTypeClass> mapFields = new HashMap<>();

    public static String addDocClass(String nameDocClass){
        String id = ID.getUniqueId(mapFields);
        TableDocClass.mapFields.put(id, new PropertyCustomTypeClass(nameDocClass));
        return id;
    }
    public static Map<String, CommonCustomerType> getFieldsMap(String idClass){
        if(TableDocClass.mapFields.containsKey(idClass)) {
            return TableDocClass.mapFields.get(idClass).getPropertiesCustom();
        }
        return null;
    }

    public static void saveMapToFile(){
        saveMap(TableDocClass.mapFields, Variables.DIRECTORY_DB+TableDocClass.FILE_DB);
    }

    public static void readMapFromFile(){
        TableDocClass.mapFields = readMap(Variables.DIRECTORY_DB+TableDocClass.FILE_DB);
        if (TableDocClass.mapFields == null) {
            TableDocClass.mapFields = new HashMap<>();
        }
    }
}