package _06_12_2022.assume;

import org.junit.Assume;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AssumeMain2 {
    @BeforeEach
    void init() {
        String v = "3";
        Assume.assumeTrue(Integer.parseInt(v) >= 4);
        System.out.println("Test Ok");
    }

    @Test
    void test() {
        System.out.println("*****");
    }

    @Test
    void test1() {
        System.out.println("!!!!!!!!!!!!!!");
    }
}