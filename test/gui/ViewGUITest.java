package gui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ViewGUITest {

    private ViewGUI viewGUI;

    @BeforeEach
    void init() throws InterruptedException, InvocationTargetException { viewGUI = new ViewGUI(); }

    @AfterEach
    void teardown() {
        viewGUI.dispose();
        viewGUI = null;
    }

    @Test
    void buttonOneClick() {
        assertEquals("1", viewGUI.buttonOne.getText());
        viewGUI.buttonOne.doClick();
        assertEquals("1", viewGUI.textFieldUserInput.getText());
    }

    @Test
    void buttonTwoClick() {
        assertEquals("2", viewGUI.buttonTwo.getText());
        viewGUI.buttonTwo.doClick();
        assertEquals("2", viewGUI.textFieldUserInput.getText());
    }

    @Test
    void buttonThreeClick() {
        assertEquals("3", viewGUI.buttonThree.getText());
        viewGUI.buttonThree.doClick();
        assertEquals("3", viewGUI.textFieldUserInput.getText());
    }

    @Test
    void buttonFourClick() {
        assertEquals("4", viewGUI.buttonFour.getText());
        viewGUI.buttonFour.doClick();
        assertEquals("4", viewGUI.textFieldUserInput.getText());
    }

    @Test
    void buttonFiveClick() {
        assertEquals("5", viewGUI.buttonFive.getText());
        viewGUI.buttonFive.doClick();
        assertEquals("5", viewGUI.textFieldUserInput.getText());
    }

    @Test
    void buttonSixClick() {
        assertEquals("6", viewGUI.buttonSix.getText());
        viewGUI.buttonSix.doClick();
        assertEquals("6", viewGUI.textFieldUserInput.getText());
    }

    @Test
    void buttonSevenClick() {
        assertEquals("7", viewGUI.buttonSeven.getText());
        viewGUI.buttonSeven.doClick();
        assertEquals("7", viewGUI.textFieldUserInput.getText());
    }

    @Test
    void buttonEightClick() {
        assertEquals("8", viewGUI.buttonEight.getText());
        viewGUI.buttonEight.doClick();
        assertEquals("8", viewGUI.textFieldUserInput.getText());
    }

    @Test
    void buttonNineClick() {
        assertEquals("9", viewGUI.buttonNine.getText());
        viewGUI.buttonNine.doClick();
        assertEquals("9", viewGUI.textFieldUserInput.getText());
    }

    @Test
    void buttonZeroClick() {
        assertEquals("0", viewGUI.buttonZero.getText());
        viewGUI.buttonZero.doClick();
        assertEquals("0", viewGUI.textFieldUserInput.getText());
    }

    @Test
    void buttonACClick() {
        assertEquals("A/C", viewGUI.buttonAC.getText());
        viewGUI.textFieldUserInput.setText("Test");
        viewGUI.buttonAC.doClick();
        assertEquals("", viewGUI.textFieldUserInput.getText());
    }


    @Test
    void buttonAddClick() {
        assertEquals("+", viewGUI.buttonAdd.getText());
        viewGUI.buttonAdd.doClick();
        assertEquals(" + ", viewGUI.textFieldUserInput.getText());
    }

    @Test
    void buttonSubtractClick() {
        assertEquals("-", viewGUI.buttonSubtract.getText());
        viewGUI.buttonSubtract.doClick();
        assertEquals(" - ", viewGUI.textFieldUserInput.getText());
    }

    @Test
    void buttonMultiplyClick() {
        assertEquals("*", viewGUI.buttonMultiply.getText());
        viewGUI.buttonMultiply.doClick();
        assertEquals(" * ", viewGUI.textFieldUserInput.getText());
    }

    @Test
    void buttonDivideClick() {
        assertEquals("/", viewGUI.buttonDivide.getText());
        viewGUI.buttonDivide.doClick();
        assertEquals(" / ", viewGUI.textFieldUserInput.getText());
    }

    @Test
    void buttonEqualsClick() {

        assertEquals("=", viewGUI.buttonEquals.getText());

        viewGUI.textFieldUserInput.setText("5 + 9");
        viewGUI.buttonEquals.doClick();
        assertEquals("14", viewGUI.textFieldUserInput.getText());

        viewGUI.textFieldUserInput.setText("5 - 9");
        viewGUI.buttonEquals.doClick();
        assertEquals("-4", viewGUI.textFieldUserInput.getText());

        viewGUI.textFieldUserInput.setText("5 * 9");
        viewGUI.buttonEquals.doClick();
        assertEquals("45", viewGUI.textFieldUserInput.getText());

        viewGUI.textFieldUserInput.setText("4 / 5");
        viewGUI.buttonEquals.doClick();
        assertEquals("0.8", viewGUI.textFieldUserInput.getText());

        viewGUI.textFieldUserInput.setText("5 ? 9");
        viewGUI.buttonEquals.doClick();
        assertEquals("Invalid Operation!", viewGUI.textFieldUserInput.getText());

        viewGUI.textFieldUserInput.setText("5 + ");
        viewGUI.buttonEquals.doClick();
        assertEquals("Malformed Input!", viewGUI.textFieldUserInput.getText());

    }

    @Test
    void userJourneyAddition() {

        assertEquals("", viewGUI.textFieldUserInput.getText());

        viewGUI.buttonOne.doClick();
        viewGUI.buttonThree.doClick();
        viewGUI.buttonFive.doClick();
        viewGUI.buttonSeven.doClick();
        viewGUI.buttonNine.doClick();

        viewGUI.buttonAdd.doClick();

        viewGUI.buttonTwo.doClick();
        viewGUI.buttonFour.doClick();
        viewGUI.buttonSix.doClick();
        viewGUI.buttonEight.doClick();
        viewGUI.buttonZero.doClick();

        assertEquals("13579 + 24680", viewGUI.textFieldUserInput.getText());

        viewGUI.buttonEquals.doClick();

        assertEquals("38259", viewGUI.textFieldUserInput.getText());

        viewGUI.buttonAC.doClick();

        assertEquals("", viewGUI.textFieldUserInput.getText());

    }

    @Test
    void userJourneySubtraction() {

        assertEquals("", viewGUI.textFieldUserInput.getText());

        viewGUI.buttonOne.doClick();
        viewGUI.buttonThree.doClick();
        viewGUI.buttonFive.doClick();
        viewGUI.buttonSeven.doClick();
        viewGUI.buttonNine.doClick();

        viewGUI.buttonSubtract.doClick();

        viewGUI.buttonTwo.doClick();
        viewGUI.buttonFour.doClick();
        viewGUI.buttonSix.doClick();
        viewGUI.buttonEight.doClick();
        viewGUI.buttonZero.doClick();

        assertEquals("13579 - 24680", viewGUI.textFieldUserInput.getText());

        viewGUI.buttonEquals.doClick();

        assertEquals("-11101", viewGUI.textFieldUserInput.getText());

        viewGUI.buttonAC.doClick();

        assertEquals("", viewGUI.textFieldUserInput.getText());

    }

    @Test
    void userJourneyMultiply() {

        assertEquals("", viewGUI.textFieldUserInput.getText());

        viewGUI.buttonOne.doClick();
        viewGUI.buttonThree.doClick();
        viewGUI.buttonFive.doClick();
        viewGUI.buttonSeven.doClick();
        viewGUI.buttonNine.doClick();

        viewGUI.buttonMultiply.doClick();

        viewGUI.buttonTwo.doClick();
        viewGUI.buttonFour.doClick();
        viewGUI.buttonSix.doClick();
        viewGUI.buttonEight.doClick();
        viewGUI.buttonZero.doClick();

        assertEquals("13579 * 24680", viewGUI.textFieldUserInput.getText());

        viewGUI.buttonEquals.doClick();

        assertEquals("3.3512972E8", viewGUI.textFieldUserInput.getText());

        viewGUI.buttonAC.doClick();

        assertEquals("", viewGUI.textFieldUserInput.getText());

    }

    @Test
    void userJourneyDivision() {

        assertEquals("", viewGUI.textFieldUserInput.getText());

        viewGUI.buttonOne.doClick();
        viewGUI.buttonThree.doClick();
        viewGUI.buttonFive.doClick();
        viewGUI.buttonSeven.doClick();
        viewGUI.buttonNine.doClick();

        viewGUI.buttonDivide.doClick();

        viewGUI.buttonTwo.doClick();
        viewGUI.buttonFour.doClick();
        viewGUI.buttonSix.doClick();
        viewGUI.buttonEight.doClick();
        viewGUI.buttonZero.doClick();

        assertEquals("13579 / 24680", viewGUI.textFieldUserInput.getText());

        viewGUI.buttonEquals.doClick();

        assertEquals("0.5502025931928687", viewGUI.textFieldUserInput.getText());

        viewGUI.buttonAC.doClick();

        assertEquals("", viewGUI.textFieldUserInput.getText());

    }

}