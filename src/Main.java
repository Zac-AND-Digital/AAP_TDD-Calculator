import gui.ViewGUI;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws
            UnsupportedLookAndFeelException,
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException, InterruptedException, InvocationTargetException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        new ViewGUI();

    }

}