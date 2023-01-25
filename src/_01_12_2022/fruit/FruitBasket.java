package _01_12_2022.fruit;

import _01_12_2022.fruit.Fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class FruitBasket {
    private List<Fruit> basket = new ArrayList<>();

    public void add(Fruit fruit) {
        basket.add(fruit);
    }

    public void remove(Fruit fruit) {
        if(!basket.contains(fruit)) {
            throw new NoSuchElementException();
        }
        basket.remove(fruit);
    }

    public int getSize() {
        return basket.size();
    }

    public void removeAll() {
        basket.clear();
    }

    public boolean addLots(List<Fruit> list) {
        return basket.addAll(list);
    }

    public String[] greet(String wish) {
        return wish.split("[ !]");
    }
}