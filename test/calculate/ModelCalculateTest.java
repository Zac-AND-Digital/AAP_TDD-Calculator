package calculate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelCalculateTest {

    private ModelCalculate modelCalculate;

    @BeforeEach
    void init() { modelCalculate = new ModelCalculate(); }

    @AfterEach
    void teardown() { modelCalculate = null; }

    @Test
    void add() {

        assertEquals(8, modelCalculate.add(4, 4));
        assertEquals(8, modelCalculate.add(6, 2));
        assertEquals(8, modelCalculate.add(8, 0));
        assertEquals(8, modelCalculate.add(2, 6));
        assertEquals(8, modelCalculate.add(0, 8));
        assertEquals(8, modelCalculate.add(-2, 10));

    }

    @Test
    void subtract() {

        assertEquals(8, modelCalculate.subtract(16, 8));
        assertEquals(8, modelCalculate.subtract(10, 2));
        assertEquals(8, modelCalculate.subtract(8, 0));
        assertEquals(-8, modelCalculate.subtract(2, 10));
        assertEquals(-8, modelCalculate.subtract(0, 8));
        assertEquals(-12, modelCalculate.subtract(-2, 10));

    }

    @Test
    void multiply() {

        assertEquals(8, modelCalculate.multiply(2, 4));
        assertEquals(8, modelCalculate.multiply(1.6, 5));
        assertEquals(8, modelCalculate.multiply(8, 1));
        assertEquals(8, modelCalculate.multiply(4, 2));
        assertEquals(8, modelCalculate.multiply(1, 8));
        assertEquals(-21, modelCalculate.multiply(-2, 10.5));

    }

    @Test
    void divide() {

        assertEquals(8, modelCalculate.divide(128, 16));
        assertEquals(0.125, modelCalculate.divide(16, 128));
        assertEquals(8, modelCalculate.divide(8, 1));
        assertEquals(0.125, modelCalculate.divide(1, 8));
        assertEquals(0, modelCalculate.divide(0, 8));
        assertEquals(-0.2, modelCalculate.divide(-2, 10));
        assertTrue(Double.isInfinite(modelCalculate.divide(5, 0)));

    }

}