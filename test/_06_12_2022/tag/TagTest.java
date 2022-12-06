package _06_12_2022.tag;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class TagTest {

    @Test
    @DisplayName("Case A")
    @Tag("production")
    @Tag("development")
    void testCaseA(TestInfo testInfo) {

    }

    @Test
    @DisplayName("Case B")
    @Tag("development")
    void testCaseB(TestInfo testInfo) {

    }

    @Test
    @DisplayName("Case C")
    @Tag("production")
    void testCaseC(TestInfo testInfo) {

    }
}