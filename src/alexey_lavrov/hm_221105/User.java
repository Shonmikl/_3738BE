package alexey_lavrov.hm_221105;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private boolean isAdmin;
    private Countries country;
    private int age;

    @Override
    public String toString() {
        return "User{" + name + ':' + isAdmin + ":" + country + ':' + age + '}' + "\n";
    }
}