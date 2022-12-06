package _06_12_2022;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ThingParameterResolver.class)
public class ThingTest {

    @Test
    void answer(Thing thing) {
        assertEquals(42, thing.answer());
    }
}