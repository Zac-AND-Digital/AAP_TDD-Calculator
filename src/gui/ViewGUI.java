package gui;

import javax.swing.*;
import java.awt.*;

public class ViewGUI extends JFrame {

    private JPanel panelMain;
    private JTextField textFieldUserInput;
    private JButton buttonOne;
    private JButton buttonTwo;
    private JButton buttonThree;
    private JButton buttonFour;
    private JButton buttonFive;
    private JButton buttonSix;
    private JButton buttonSeven;
    private JButton buttonEight;
    private JButton buttonNine;
    private JButton buttonZero;
    private JButton buttonAC;
    private JButton buttonEquals;

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
        
    }

}
