package parse;

import calculate.ModelCalculate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelParseTest {

    private ModelParse modelParse;

    @BeforeEach
    void init() { modelParse = new ModelParse(); }

    @AfterEach
    void teardown() { modelParse = null; }

    @Test
    void getOperation() {

        String[] calculationAdd = new String[] {"9", "+", "44"};
        String[] calculationSubtract = new String[] {"9", "-", "44"};
        String[] calculationMultiply = new String[] {"9", "*", "44"};
        String[] calculationDivide = new String[] {"9", "/", "44"};

        assertEquals(Operation.ADD, modelParse.getOperation(calculationAdd));
        assertEquals(Operation.SUBTRACT, modelParse.getOperation(calculationSubtract));
        assertEquals(Operation.MULTIPLY, modelParse.getOperation(calculationMultiply));
        assertEquals(Operation.DIVIDE, modelParse.getOperation(calculationDivide));

    }

    @Test
    void getCalculation() {

        String calculationAdd = "58 + 3";
        String calculationSubtract = "58 - 3";
        String calculationMultiply = "58 * -3";
        String calculationDivide = "58 / 3.5";

        assertEquals(new String[] {"58", "+", "3"}, modelParse.getCalculation(calculationAdd));
        assertEquals(new String[] {"58", "-", "3"}, modelParse.getCalculation(calculationSubtract));
        assertEquals(new String[] {"58", "*", "-3"}, modelParse.getCalculation(calculationMultiply));
        assertEquals(new String[] {"58", "/", "3.5"}, modelParse.getCalculation(calculationDivide));

    }

}