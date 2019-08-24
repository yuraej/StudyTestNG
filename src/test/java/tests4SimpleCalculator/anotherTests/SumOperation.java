package tests4SimpleCalculator.anotherTests;

import codeUnderTest.SimpleCalculator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SumOperation {
    private SimpleCalculator calc;

    @BeforeSuite
    public void getCopy() {
        calc = new SimpleCalculator();
    }

    @Test(priority = 1, groups = "not simple",
    description = "check summarize operation with a lot of data",
    dataProvider = "dataForTest")
    public void checkSumOperation(double result, double number1, double number2) {
        assertEquals(result, calc.summarize(number1, number2));
    }

    @DataProvider
    public Object[][] dataForTest() {
        return new Object[][] {
                {2.0, 1, 1},
                {4.0, 2, 2},
                {3.0, 3, 0},
                {6.0, 4, 2},
                {9.0, 2, 7},
                {2.0, -1, 3}
        };
    }
}
