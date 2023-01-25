package aleksey_babaykin.project.models.data;

import aleksey_babaykin.project.models.data.customerType.CustomerType;
import aleksey_babaykin.project.models.enums.ValueType;
import aleksey_babaykin.project.models.interfaces.CommonCustomerType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
@Getter
@Setter
@NoArgsConstructor
public class PropertyCustomType implements Serializable {
    // Map<name field, like name field in Database, CommonCustomerType>
    private Map<String, CommonCustomerType> propertiesCustom = new HashMap<>();

    public PropertyCustomType(Map<String, CommonCustomerType> propertiesCustom){
        this.propertiesCustom = propertiesCustom;
    }

    public boolean addDocField(String nameField, ValueType valueType) {
        if (!propertiesCustom.containsKey(nameField)) {
            switch (valueType) {
                case INT:
                    // it is possible to set only <>, however I would like to be 100% sure which type is.
                    propertiesCustom.put(nameField, new CustomerType<Integer>(nameField, 0));
                    return true;
                case STR:
                    propertiesCustom.put(nameField, new CustomerType<String>(nameField, ""));
                    return true;
                case BLN:
                    propertiesCustom.put(nameField, new CustomerType<>(nameField, Boolean.FALSE));
                    return true;
                case DATE:
                    propertiesCustom.put(nameField, new CustomerType<LocalDateTime>(nameField, null));
                    return true;
            }
        }
        return false;
    }

    public boolean addDocFieldWithValue(String nameField, ValueType valueType, Object valueObject) {
        if (!propertiesCustom.containsKey(nameField)) {
            switch (valueType) {
                case INT:
                    // it is possible to set only <>, however I would like to be 100% sure which type is.
                    propertiesCustom.put(nameField, new CustomerType<>(nameField, (Integer) valueObject));
                    return true;
                case STR:
                    propertiesCustom.put(nameField, new CustomerType<>(nameField, (String) valueObject));
                    return true;
                case BLN:
                    propertiesCustom.put(nameField, new CustomerType<>(nameField, (Boolean) valueObject));
                    return true;
                case DATE:
                    propertiesCustom.put(nameField, new CustomerType<>(nameField, (LocalDateTime) valueObject));
                    return true;
            }
        }
        return false;
    }

    // update & delete - there will be developed with real DB --- The problem is: if it is delay in type Map,
    // it will be necessary to delay it in data table.
}