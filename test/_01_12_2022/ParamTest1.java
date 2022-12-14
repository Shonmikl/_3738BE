package _01_12_2022;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTest1 {

//    @Test
//    void testLength() {
//        Assertions.assertTrue("888888".length() > 3);
//        Assertions.assertTrue("88888".length() > 3);
//        Assertions.assertTrue("8888".length() > 3);
//    }

    @ParameterizedTest
    @ValueSource(strings = {"888888", "88888", "8888"})
    static void testLength(String args) {
        Assertions.assertTrue(args.length() > 3);
    }
}
