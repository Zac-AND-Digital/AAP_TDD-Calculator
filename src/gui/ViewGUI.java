package gui;

import javax.swing.*;
import java.awt.*;

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
    
    public ViewGUI() {
        
        SwingUtilities.invokeLater(this::init);

        buttonOne.addActionListener(actionEvent -> {
            // TODO: Implement Method
        });

        buttonTwo.addActionListener(actionEvent -> {
            // TODO: Implement Method
        });

        buttonThree.addActionListener(actionEvent -> {
            // TODO: Implement Method
        });

        buttonFour.addActionListener(actionEvent -> {
            // TODO: Implement Method
        });

        buttonFive.addActionListener(actionEvent -> {
            // TODO: Implement Method
        });

        buttonSix.addActionListener(actionEvent -> {
            // TODO: Implement Method
        });

        buttonSeven.addActionListener(actionEvent -> {
            // TODO: Implement Method
        });

        buttonEight.addActionListener(actionEvent -> {
            // TODO: Implement Method
        });

        buttonNine.addActionListener(actionEvent -> {
            // TODO: Implement Method
        });

        buttonZero.addActionListener(actionEvent -> {
            // TODO: Implement Method
        });

        buttonAC.addActionListener(actionEvent -> {
            // TODO: Implement Method
        });

        buttonEquals.addActionListener(actionEvent -> {
            // TODO: Implement Method
        });

    }

}
