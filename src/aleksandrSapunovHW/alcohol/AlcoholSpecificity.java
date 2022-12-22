package alcohol;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class AlcoholSpecificity implements Comparable<AlcoholSpecificity> {
    String name;
    String colour;
    int price;
    boolean legal;
    int strengthAlcoholInPercent;

    @Override
    public int compareTo(AlcoholSpecificity nextAlcoholSpecificity) {
        if (this.price == nextAlcoholSpecificity.price &&
                this.strengthAlcoholInPercent == nextAlcoholSpecificity.strengthAlcoholInPercent) {
            System.out.println("Этот Алкоголь по цене Идентичен оригиналу");
        } else if (this.price < nextAlcoholSpecificity.price &&
                this.strengthAlcoholInPercent < nextAlcoholSpecificity.strengthAlcoholInPercent) {
            System.out.println("Этот Алкоголь подделка!");
        }
        return 0;
    }
}