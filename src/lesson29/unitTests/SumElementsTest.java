package lesson29.unitTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumElementsTest {

    SumElements sumElements;
    @BeforeEach
    void setUp() {
    }

    @Test
    void avgOfEvenElements() {
        int[] arr = {10, 21, 20, 41};
        assertEquals(15.0, SumElements.avgOfEvenElements(arr));
    }
}