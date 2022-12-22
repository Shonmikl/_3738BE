package alcohol.overseasMarket;

import alcohol.AlcoholSpecificity;
import alcohol.interfaces.Printable;
import aleksanderSapunovHW.homeWork_08112022.Employees;

public class OverseasProduction extends AlcoholSpecificity implements Printable {
    int domesticPrice;
    public OverseasProduction(String name, String colour, int price, boolean legal, int strengthAlcoholInPercent, int domesticPrice) {
        super(name, colour, price, legal, strengthAlcoholInPercent);
        this.domesticPrice = domesticPrice;
    }
    @Override
    public void print() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "OverseasProduction{" +
                "domesticPrice=" + domesticPrice +
                '}';
    }

    OverseasProduction ovAlc1 = new OverseasProduction("Vermont Spirits","transparent",700,true, 40,654);
    OverseasProduction ovAlc2 = new OverseasProduction("Vox","transparent",780,true, 40,732);
    OverseasProduction ovAlc3 = new OverseasProduction("La Marca Prosecco","white",560,true, 12,500);
    OverseasProduction ovAlc4 = new OverseasProduction("Jameson","cold brew",615,true, 40,595);
    OverseasProduction ovAlc5 = new OverseasProduction("Jim Beam","amber",567,true, 40,532);
    OverseasProduction ovAlc6 = new OverseasProduction("Tanduay","orange",610,true, 35,589);
    OverseasProduction ovAlc7 = new OverseasProduction("Don Papa","bright amber",812,true, 34,799);
    OverseasProduction ovAlc8 = new OverseasProduction("Jagermeister","brown",519,true, 30,511);
    OverseasProduction ovAlc9 = new OverseasProduction("Baileys","brown",689,true, 28,673);
}