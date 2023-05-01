package calculate;

import parse.Operation;

public class ControllerCalculate {

    private final ModelCalculate modelCalculate;

    public ControllerCalculate() { modelCalculate = new ModelCalculate(); }

    public String getCalculation(String[] calculation, Operation operation) {

        long x = Long.parseLong(calculation[0]);
        long y = Long.parseLong(calculation[2]);
        double answer = 0.0d;

        switch (operation) {
            case ADD -> answer = modelCalculate.add(x, y);
            case SUBTRACT -> answer = modelCalculate.subtract(x, y);
            case MULTIPLY -> answer = modelCalculate.multiply(x, y);
            case DIVIDE -> answer = modelCalculate.divide(x, y);
        }

        return String.valueOf(answer).replace(".0", "");

    }

}
