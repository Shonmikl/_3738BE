package _06_12_2022.categoryAnn;

import org.junit.experimental.categories.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.runners.Suite;

public class CategoriesTest {


    public interface FastTests {}
    public interface SlowTests {}
    public interface SmokeTests {}

    public static class A {

        @Test
        void a() {
            System.out.println("running A//a()");
        }

        @Test
        @Category(SlowTests.class)
        void b() {
            System.out.println("running A//b()");
        }

        @Test
        @Category(FastTests.class)
        void c() {
            System.out.println("running A//c()");
        }
    }

    @Category({SlowTests.class, FastTests.class})
    public static class B {

        @Test
        void d() {
            System.out.println("running B//d()");
        }
    }

    //@RunWith(CategoriesTest.class)
    @Categories.IncludeCategory({FastTests.class, SmokeTests.class})
    @Suite.SuiteClasses({A.class, B.class})
    public static class SlowTestSuite {

    }
}
