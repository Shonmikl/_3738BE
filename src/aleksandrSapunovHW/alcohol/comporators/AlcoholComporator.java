package alcohol.comporators;

import alcohol.AlcoholSpecificity;
import java.util.Comparator;

public class AlcoholComporator implements Comparator<AlcoholSpecificity> {

    @Override
    public int compare(AlcoholSpecificity first, AlcoholSpecificity second) {
        int result;
        if ((result = first.getName().compareTo(second.getName())) == 0) {
            if ((result = first.getColour().compareTo(second.getColour())) == 0);
        }
        return result;
    }
}