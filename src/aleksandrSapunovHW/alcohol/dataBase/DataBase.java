package alcohol.dataBase;

import alcohol.AlcoholSpecificity;
import alcohol.enums.typeAlco;
import alcohol.ourMarket.OurProduction;
import alcohol.overseasMarket.OverseasProduction;
import lombok.Getter;
import lombok.Setter;
import java.util.*;

@Setter
@Getter
public class DataBase {
    private List<OurProduction> ourProdList = new LinkedList<>();
    private List<OverseasProduction> overseasProdList = new LinkedList<>();

    private TreeMap<AlcoholSpecificity, Integer> OverseasMap = new TreeMap<>();
    private Set<String> AlcoSet = new TreeSet<>();
    private Deque<typeAlco> DeqSet = new ArrayDeque<>();

    public void addToProdList (OurProduction ourAlc,OverseasProduction ovAlc){
        ourProdList.add(1,ourAlc);//todo не будет ли перезатирать или начинает с первой позиции?
        overseasProdList.add(1,ovAlc);//todo тоже самое...
    }

    public void addToProdMap (AlcoholSpecificity name,Integer number){
        OverseasMap.put(name,number);
    }
}