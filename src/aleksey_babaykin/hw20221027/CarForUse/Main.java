package aleksey_babaykin.hw20221027.CarForUse;

public class Main {
    public static void main(String[] args) {
        AvtoMarket avtoMarket = new AvtoMarket();
        avtoMarket.createList();
        avtoMarket.arrayToString();
        avtoMarket.getDataBase().printHashMap();
        avtoMarket.getDataBase().printTreeMap();
        avtoMarket.getDataBase().printTreeSet();
        avtoMarket.getDataBase().printDeque();
    }
}