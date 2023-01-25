package aleksey_babaykin.project.models.data;

import aleksey_babaykin.project.models.data.customerType.CustomerType;
import aleksey_babaykin.project.models.interfaces.CommonCustomerType;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@NoArgsConstructor
public class PropertyCustomTypeDocument extends PropertyCustomType implements Serializable {
    public PropertyCustomTypeDocument(Map<String, CommonCustomerType> propertiesCustom){
        super(propertiesCustom);
    }
    public static <K extends String,V extends CommonCustomerType>  Map<K , V> getMapCustomerParams(
                                                    Map<K, V> mapClassFields,
                                                    Map<K, V> newValueMap,
                                                    Map<K, V> existingVersionInstance) {

        Map<K, V> tempMap = new HashMap<>();
        if (mapClassFields != null) {
            if (existingVersionInstance != null) {
                tempMap = PropertyCustomTypeDocument.createNewFromExist(tempMap,existingVersionInstance);
                tempMap = PropertyCustomTypeDocument.addItemsToExistNoUpdate(tempMap, mapClassFields);
            } else {
                tempMap = PropertyCustomTypeDocument.createNewFromExist(tempMap,mapClassFields);
            }
            tempMap = PropertyCustomTypeDocument.updateItemsIfExist(tempMap, newValueMap);
            return tempMap;
        } else {
            return null; /// TODO Add exception
        }
    }
    public static <K extends String,V extends CommonCustomerType> Map<K, V> createNewFromExist(Map<K, V> initMap, Map<K, V> existMap) {
        if(existMap == null){
            return initMap;
        }else{
            return existMap
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        }
    }
    public static <K extends String,V extends CommonCustomerType> Map<K, V> addItemsToExistNoUpdate(Map<K, V> initMap, Map<K, V> toAddMap) {
        if(toAddMap != null){
             toAddMap.forEach((k,v) -> {
                if(!initMap.containsKey(k)){
                    initMap.put(k, v);
                }
            });
        }
        return initMap;
    }
    public static <K extends String,V extends CommonCustomerType> Map<K, V> updateItemsIfExist(Map<K, V> initMap, Map<K, V> forUpdateMap) {
        if(forUpdateMap != null){
            forUpdateMap.forEach((k,v) -> {
                if(initMap.containsKey(k)){
                    initMap.replace(k, v);
                }
            });
        }
        return initMap;
    }
}