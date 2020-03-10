import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    @Test
    public void testDivisionPositiveValues(){
        assertEquals("4 / 2 must be 2", 2.0, calc.division(4,2));
    }

    @Test
    public void testDivisionDivideByZero(){
        assertEquals("4 / 0 must be Can't be divided by Zero", 0.0, calc.division(4,0));
    }

    @Test
    public void testSubtractionPositiveValues(){
        assertEquals("10 - 3 must be 7", 7, calc.subtraction(10,3));
    }

    @Test
    public void testMultiplyPositiveValues() {
        assertEquals("4 * 2 must be 8", 8, calc.multiply(4,2));
    }

    @Test
    public void testSquarePositiveValues() {
        assertEquals("8 in square must be 16", 16, calc.square(4));
    }

    @Test
    public void testRootPositiveValues() {
        assertEquals("square root of 9025 must be 95", 95.0, calc.root(9025));
    }

    @Test
    public void testRootNegativeValues() {
        assertEquals("square root of -2 must be NaN",0.0, calc.root(-2));
    }

    @Test
    public void testExponentiatingPositiveValues() {
        assertEquals("8 in the 3 degree is 512", 512.0, calc.exponentiating(8, 3));
    }

    //TODO
    //add new tests for add() method

    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");
    }
}
