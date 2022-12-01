package _08_11_2022;

import java.util.function.Predicate;

public class TestFI implements Predicate<TestFI> {

    @Override
    public boolean test(TestFI testFI) {
        return false;
    }
}
