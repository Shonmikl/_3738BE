package _06_12_2022.assume;

import org.junit.Assume;
import org.junit.jupiter.api.Test;

public class AssumeTest1 {

//    @Test
//    void testIfGreaterThan4() {
//        String v = "7";
//        Assume.assumeTrue(Integer.valueOf(v) >= 4);
//        System.out.println("Test OK");
//    }

    @Test
    void testIfGreaterThan4_2() {
        String v = "3";
        Assume.assumeTrue(Integer.valueOf(v) >= 4);
        System.out.println("Test OK");
    }
}
