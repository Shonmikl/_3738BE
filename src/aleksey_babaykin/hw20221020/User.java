package aleksey_babaykin.hw20221020;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class User {
    @Getter
    @Setter

    private String firstName;
    private String secondName;
    private Status status;
    private String email;

    public void  insertUserDataToDB(){
        System.out.println("User information inserted  to DB");
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", status=" + status +
                ", email='" + email + '\'' +
                '}';
    }
}



