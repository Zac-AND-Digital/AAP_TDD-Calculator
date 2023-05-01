package calculate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import parse.Operation;

import static org.junit.jupiter.api.Assertions.*;

class ControllerCalculateTest {

    private ControllerCalculate controllerCalculate;

    @BeforeEach
    void init() { controllerCalculate = new ControllerCalculate(); }

    @AfterEach
    void teardown() { controllerCalculate = null; }

    @Test
    void getCalculation() {

        String[] calculation;
        Operation operation;

        calculation = new String[] {"6", "+", "6"};
        operation = Operation.ADD;

        assertEquals("12", controllerCalculate.getCalculation(calculation, operation));

        calculation = new String[] {"6", "-", "6"};
        operation = Operation.SUBTRACT;

        assertEquals("0", controllerCalculate.getCalculation(calculation, operation));

        calculation = new String[] {"6", "*", "6"};
        operation = Operation.MULTIPLY;

        assertEquals("36", controllerCalculate.getCalculation(calculation, operation));

        calculation = new String[] {"6", "/", "7"};
        operation = Operation.DIVIDE;

        assertEquals("0.8571428571428571", controllerCalculate.getCalculation(calculation, operation));

    }

}