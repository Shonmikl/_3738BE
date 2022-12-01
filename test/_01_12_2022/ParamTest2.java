package _01_12_2022;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ParamTest2 {

    @ParameterizedTest
    @CsvSource(value = {"OIUYT,oiuyt", "MNBVC,mnbvc", "'',''"})
    void testLowerCase(String arg, String lowered) {
        Assertions.assertEquals(lowered, arg.toLowerCase());
    }
//
//    @ParameterizedTest
//    @CsvFileSource(resources = "2222.csv")
//    void testLowerCaseFile(String arg, String lowered) {
//        Assertions.assertEquals(lowered, arg.toLowerCase());
//    }

    @Disabled("Because....")
    void testDisabled() {
        System.out.println("!!!!!");
    }
}