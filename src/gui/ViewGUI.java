package gui;

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
    JButton buttonEquals;

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
        buttonEquals.setText("=");

        setContentPane(panelMain);
        setTitle("AAP TDD Calculator");
        setPreferredSize(new Dimension(384, 216));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    public ViewGUI() throws InterruptedException, InvocationTargetException {
        
        SwingUtilities.invokeAndWait(this::init);

        buttonOne.addActionListener(actionEvent -> {
            textFieldUserInput.setText(textFieldUserInput.getText() + "1");
        });

        buttonTwo.addActionListener(actionEvent -> {
            textFieldUserInput.setText(textFieldUserInput.getText() + "2");
        });

        buttonThree.addActionListener(actionEvent -> {
            textFieldUserInput.setText(textFieldUserInput.getText() + "3");
        });

        buttonFour.addActionListener(actionEvent -> {
            textFieldUserInput.setText(textFieldUserInput.getText() + "4");
        });

        buttonFive.addActionListener(actionEvent -> {
            textFieldUserInput.setText(textFieldUserInput.getText() + "5");
        });

        buttonSix.addActionListener(actionEvent -> {
            textFieldUserInput.setText(textFieldUserInput.getText() + "6");
        });

        buttonSeven.addActionListener(actionEvent -> {
            textFieldUserInput.setText(textFieldUserInput.getText() + "7");
        });

        buttonEight.addActionListener(actionEvent -> {
            textFieldUserInput.setText(textFieldUserInput.getText() + "8");
        });

        buttonNine.addActionListener(actionEvent -> {
            textFieldUserInput.setText(textFieldUserInput.getText() + "9");
        });

        buttonZero.addActionListener(actionEvent -> {
            textFieldUserInput.setText(textFieldUserInput.getText() + "0");
        });

        buttonAC.addActionListener(actionEvent -> {
            textFieldUserInput.setText("");
        });

        buttonEquals.addActionListener(actionEvent -> {
            // TODO: Implement Method
        });

    }

}
