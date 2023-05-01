package gui;

import calculate.ControllerCalculate;
import parse.ControllerParse;
import parse.Operation;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

public class ViewGUI extends JFrame {

    JPanel panelMain;
    JTextField textFieldUserInput;
    JButton buttonOne;
    JButton buttonTwo;
    JButton buttonThree;
    JButton buttonFour;
    JButton buttonFive;
    JButton buttonSix;
    JButton buttonSeven;
    JButton buttonEight;
    JButton buttonNine;
    JButton buttonZero;
    JButton buttonAC;
    JButton buttonAdd;
    JButton buttonSubtract;
    JButton buttonMultiply;
    JButton buttonDivide;
    JButton buttonEquals;

    boolean isOperationSelected;

    private void init() {

        buttonOne.setText("1");
        buttonTwo.setText("2");
        buttonThree.setText("3");
        buttonFour.setText("4");
        buttonFive.setText("5");
        buttonSix.setText("6");
        buttonSeven.setText("7");
        buttonEight.setText("8");
        buttonNine.setText("9");
        buttonZero.setText("0");
        buttonAC.setText("A/C");
        buttonAdd.setText("+");
        buttonSubtract.setText("-");
        buttonMultiply.setText("*");
        buttonDivide.setText("/");
        buttonEquals.setText("=");

        isOperationSelected = false;

        setContentPane(panelMain);
        setTitle("AAP TDD Calculator");
        setPreferredSize(new Dimension(384, 360));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    public ViewGUI() throws InterruptedException, InvocationTargetException {
        
        SwingUtilities.invokeAndWait(this::init);

        buttonOne.addActionListener(actionEvent -> textFieldUserInput.setText(textFieldUserInput.getText() + "1"));

        buttonTwo.addActionListener(actionEvent -> textFieldUserInput.setText(textFieldUserInput.getText() + "2"));

        buttonThree.addActionListener(actionEvent -> textFieldUserInput.setText(textFieldUserInput.getText() + "3"));

        buttonFour.addActionListener(actionEvent -> textFieldUserInput.setText(textFieldUserInput.getText() + "4"));

        buttonFive.addActionListener(actionEvent -> textFieldUserInput.setText(textFieldUserInput.getText() + "5"));

        buttonSix.addActionListener(actionEvent -> textFieldUserInput.setText(textFieldUserInput.getText() + "6"));

        buttonSeven.addActionListener(actionEvent -> textFieldUserInput.setText(textFieldUserInput.getText() + "7"));

        buttonEight.addActionListener(actionEvent -> textFieldUserInput.setText(textFieldUserInput.getText() + "8"));

        buttonNine.addActionListener(actionEvent -> textFieldUserInput.setText(textFieldUserInput.getText() + "9"));

        buttonZero.addActionListener(actionEvent -> textFieldUserInput.setText(textFieldUserInput.getText() + "0"));

        buttonAC.addActionListener(actionEvent -> {

            textFieldUserInput.setText("");
            isOperationSelected = false;

        });

        buttonAdd.addActionListener(actionEvent -> {

            if (isOperationSelected) return;
            textFieldUserInput.setText(textFieldUserInput.getText() + " + ");
            isOperationSelected = true;

        });

        buttonSubtract.addActionListener(actionEvent -> {

            if (isOperationSelected) return;
            textFieldUserInput.setText(textFieldUserInput.getText() + " - ");
            isOperationSelected = true;

        });

        buttonMultiply.addActionListener(actionEvent -> {

            if (isOperationSelected) return;
            textFieldUserInput.setText(textFieldUserInput.getText() + " * ");
            isOperationSelected = true;

        });

        buttonDivide.addActionListener(actionEvent -> {

            if (isOperationSelected) return;
            textFieldUserInput.setText(textFieldUserInput.getText() + " / ");
            isOperationSelected = true;

        });

        buttonEquals.addActionListener(actionEvent -> {

            ControllerParse controllerParse = new ControllerParse();
            ControllerCalculate controllerCalculate = new ControllerCalculate();

            String[] calculation = controllerParse.getCalculation(textFieldUserInput.getText());
            Operation operation = controllerParse.getOperation(calculation);

            if (operation == Operation.NO_OPERATION) {
                textFieldUserInput.setText("Invalid Operation!");
                return;
            }

            if (operation == Operation.MALFORMED) {
                textFieldUserInput.setText("Malformed Input!");
                return;
            }

            textFieldUserInput.setText(controllerCalculate.getCalculation(calculation, operation));

        });

    }

}
