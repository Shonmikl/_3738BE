package aleksey_babaykin.hw20221020;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class DataBase {

    @Getter
    @Setter

    private String idConnection;

    public Item getData(){
        Item item = new Item();

        System.out.println("Get data fom DB");

        return item;
    }
}

