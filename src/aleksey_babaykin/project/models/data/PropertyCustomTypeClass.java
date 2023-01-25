package aleksey_babaykin.project.models.data;

import java.io.Serializable;

public class PropertyCustomTypeClass extends PropertyCustomType implements Serializable{
    String nameClass;
    public PropertyCustomTypeClass(String nameClass) {
        super();
        this.nameClass = nameClass;
    }

    @Override
    public String toString() {
        return " PropertyCustomTypeClass{" +
                "nameClass='" + nameClass + '\'' +
                '}';
    }
}