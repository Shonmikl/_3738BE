package aleksey_babaykin.project.models.interfaces;

import java.io.Serializable;
import java.util.ArrayList;

public interface CommonCustomerType<T>{
    void setNameField(String nameField);
    String getNameField();
    void setValue(T value);
    T getValue();
}