package parse;

public class ModelParse {

    Operation getOperation(String[] input) {

        if (input.length != 3) return Operation.MALFORMED;

        switch (input[1]) {

            case "+" -> { return Operation.ADD; }
            case "-" -> { return Operation.SUBTRACT; }
            case "*" -> { return Operation.MULTIPLY; }
            case "/" -> { return Operation.DIVIDE; }
            default -> { return Operation.NO_OPERATION; }

        }

    }

    String[] getCalculation(String input) {

        return input.strip().replaceAll("\\s+", " ").split(" ");

    }

}
