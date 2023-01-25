package aleksey_babaykin.project.models.data.customerType;

import aleksey_babaykin.project.models.interfaces.CommonCustomerType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerType<T> implements CommonCustomerType<T>, Serializable {
    // name parameter for user, web
    String nameField;
    // value of the parameter
    T value;

    @Override
    public String toString() {
        return "{DtC{" +
                "fn='" + nameField + '\'' +
                ", v=" + value.toString() +
                ", t=" + value.getClass().toString()+
                '}';
    }
}