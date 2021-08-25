import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySumTest {
    @Test
    public void arraySum_verify_shouldReturnFalse_whenTheSumOfTheDigitsIsNotTheExpectedResult() throws Exception {
        int expectedResult = 4;
        int arrayLength = 2;

        boolean result = ArraySum.verify(new int[]{
                expectedResult, arrayLength, 1, 2
        });

        assertFalse(result);
    }

    @Test
    public void arraySum_verify_shouldReturnTrue1() throws Exception {
        int expectedResult = 66;
        int arrayLength = 10;
        var values = new int[]{
                expectedResult, arrayLength, 18, 11, 21, 28, 31, 38, 40, 55, 60, 62
        };

        boolean result = ArraySum.verify(values);

        assertTrue(result);
    }

    @Test
    public void arraySum_verify_shouldReturnTrue2() throws Exception {
        int expectedResult = 20;
        int arrayLength = 4;
        var values = new int[]{
                expectedResult, arrayLength, 1, 15, 2, 5
        };

        boolean result = ArraySum.verify(values);

        assertTrue(result);
    }

    @Test
    public void arraySum_verify_shouldThrowException_whenTheValuesDoNotMatchTheArrayLength() {
        int expectedResult = 10;
        int arrayLength = 6;
        var values = new int[]{
            expectedResult, arrayLength, 1, 2, 3, 4, 5, 6, 7, 8, 9
        };

        assertThrows(Exception.class, () -> ArraySum.verify(values));
    }
}