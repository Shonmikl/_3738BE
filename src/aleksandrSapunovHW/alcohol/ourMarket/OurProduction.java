package alcohol.ourMarket;

import alcohol.AlcoholSpecificity;
import alcohol.dataBase.DataBase;
import alcohol.interfaces.Printable;

public class OurProduction extends AlcoholSpecificity implements Printable {
    int domesticPrice;

    public OurProduction(String name, String colour, int price, boolean legal, int strengthAlcoholInPercent, int domesticPrice) {
        super(name, colour, price, legal, strengthAlcoholInPercent);
        this.domesticPrice = domesticPrice;
    }

    @Override
    public void print() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "OurProduction{" +
                "domesticPrice=" + domesticPrice +
                '}';
    }

    OurProduction ourAlc1 = new OurProduction("Jelzin","transparent",300,true, 40,250);
    OurProduction ourAlc2 = new OurProduction("Finlandia","transparent",450,true, 40,400);
    OurProduction ourAlc3 = new OurProduction("Inkerman","red",450,true, 20,415);
    OurProduction ourAlc4 = new OurProduction("Carlsberg","light yellow",215,true, 10,209);
    OurProduction ourAlc5 = new OurProduction("Artwinery","white",387,true, 18,344);
    OurProduction ourAlc6 = new OurProduction("Shabo","amber",432,true, 40,413);
    OurProduction ourAlc7 = new OurProduction("Bolgrad ","amber",457,true, 40,447);
    OurProduction ourAlc8 = new OurProduction("Samogon","transparent",130,false, 33,130);
}