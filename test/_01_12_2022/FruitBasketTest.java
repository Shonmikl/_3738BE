package _01_12_2022;

import _01_12_2022.fruit.Fruit;
import _01_12_2022.fruit.FruitBasket;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class FruitBasketTest {

    private final FruitBasket basket = new FruitBasket();
    private final Fruit apple = new Fruit("Apple", 120);
    private final Fruit orange = new Fruit("Orange", 120);
    private final Fruit pear = new Fruit("Pear", 120);

    @BeforeEach
    public void init() {
        basket.add(apple);
        basket.add(orange);
        basket.add(pear);
    }


    @Test
    void add() {
        basket.add(new Fruit("Banana", 200));
        assertEquals(4, basket.getSize());
    }

    @Test
    void remove() {
        basket.remove(orange);
        assertEquals(2, basket.getSize());
    }

    @Test
    void removeWithException() {
        assertThrows(NoSuchElementException.class,
                () -> basket.remove(new Fruit("Kiwi", 1)));
    }

    @Test
    void getSize() {
        assertEquals(3, basket.getSize());
    }

//    @Test
//    void testForTimeout() {
//        assertTimeout(Duration.ofMillis(1)
//                      ,()-> Thread.sleep(100));
//    }

    @Test
    void testBool() {
        List<Fruit> lot = Arrays.asList(
                new Fruit("Peach", 12),
                new Fruit("Mango", 11),
                new Fruit("Mandarin", 55));
        assertTrue(basket.addLots(lot));
    }

    @AfterEach
    public void destroy() {
        basket.removeAll();
    }

    @Test
    void testArray() {
        String wish = "Crikey that's gone about by well over a foot!";
        String[] expected = {"Crikey", "that's",
                "gone", "about", "by", "well", "over", "a", "foot"};
        String[] actual = basket.greet(wish);
        assertArrayEquals(expected, actual);
    }
}