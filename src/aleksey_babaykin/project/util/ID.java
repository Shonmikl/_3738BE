package aleksey_babaykin.project.util;

import java.util.Map;
import java.util.UUID;

public class ID {
    public static String getUniqueId(Map<String, ?> map) {
        boolean isPresentID = true;
        String idString = null;
        while (isPresentID) {
            idString = getIdUUIDString();
            isPresentID = map.containsKey(idString);
        }
        return idString;
    }

    public static String getIdUUIDString() {
        return UUID.randomUUID().toString();
    }
}