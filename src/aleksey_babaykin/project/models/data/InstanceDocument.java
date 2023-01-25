package aleksey_babaykin.project.models.data;

import aleksey_babaykin.project.models.interfaces.CommonCustomerType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor

public class InstanceDocument implements Serializable {
    private String idClass;
    private String idVersion;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private int versionNumber;
    private boolean lastVersion;
    private PropertyCustomTypeDocument propertyCustomTypeDocument ;

    public InstanceDocument(String idClass, String idVersion, LocalDateTime createDate, int versionNumber, Map<String, CommonCustomerType> mapCustomFields) {
        this.idClass = idClass;
        this.idVersion = idVersion;
        this.createDate = createDate == null ? LocalDateTime.now() : createDate;
        this.updateDate = LocalDateTime.now();
        this.versionNumber = versionNumber;
        this.lastVersion = true;
        this.propertyCustomTypeDocument = new PropertyCustomTypeDocument(mapCustomFields);
    }

    @Override
    public String toString() {
        return "InstanceDocument{" +
                "idClass='" + idClass + '\'' +
                ", idVersion='" + idVersion + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", versionNumber=" + versionNumber +
                ", lastVersion=" + lastVersion +
                ", propertyCustomTypeDocument=" + propertyCustomTypeDocument +
                '}';
    }
}