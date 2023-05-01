package parse;

public class ControllerParse {

    private final ModelParse modelParse;

    public ControllerParse() { modelParse = new ModelParse(); }

    public Operation getOperation(String[] input) { return modelParse.getOperation(input); }

    public String[] getCalculation(String input) { return modelParse.getCalculation(input); }

}
