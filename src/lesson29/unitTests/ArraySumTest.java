package lesson29.unitTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySumTest {

    ArraySum arraySum;

    @BeforeEach
    void setUp() {
        arraySum = new ArraySum();
    }

    @Test
    void sumOfOddIndxEl() {
        int[] arr = {10, 20, -30, 40};
        assertEquals(60, ArraySum.sumOfOddIndxEl(arr));
    }
}