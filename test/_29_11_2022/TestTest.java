package _29_11_2022;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    private Test test = new Test();

    int[] arr5 = {1, 2, 3, 6, 5};
    int[] arr2 = {1, 2};
    int[] arr1 = {1};


    @ParameterizedTest
    @MethodSource
    void getSecondOverTwoLength() {
        Assert.assertEquals(2, test.getSecond(arr5));
        Assert.assertEquals(2, test.getSecond(arr2));

    }
    @org.junit.jupiter.api.Test
    void getSecondOverTwoLengthVoid() {
      //  Assert.assertEquals("2", test.getSecondVoid(arr2));
    }

    @org.junit.jupiter.api.Test
    void getSecondWithException() {
       // Assert.assertThrows(NotCompatibleArrayException.class, () ->  )
    }
}