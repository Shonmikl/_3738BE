package aleksey_babaykin.project.models.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InstanceFile{
    // private String id -- id is a key in map. There is an information about file
    private String loadFileName;
    private Long loadSize;

    @Override
    public String toString() {
        return "InstanceFile{" +
                "File Name = '" + loadFileName + " \\ " +
                ", loadSize = " + loadSize +
                '}';
    }
}

