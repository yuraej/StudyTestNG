package tests4SimpleCalculator;

import codeUnderTest.SimpleCalculator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DeductOperation extends BaseTest{
    /*SimpleCalculator calc;

    @BeforeClass
    public void getCopy() {
        calc = new SimpleCalculator();
    }*/

    @Test(priority = 1,
            groups = {"not simple", "the reduction operation"},
            description = "check deduct operation with a lot of data",
            dataProvider = "dataForTest")
    public void checkDeductOperation(double result, double number1, double number2) {
        assertEquals(result, calc.deduct(number1, number2));
    }

    @DataProvider(parallel = true)
    public Object[][] dataForTest() {
        return new Object[][]{
                {0.0, 1, 1}, {10.0, 15, 5},
                {0.0, 2, 2}, {5.0, 10, 5},
                {3.0, 3, 0}, {0.0, 3, 3},
                {2.0, 4, 2}, {7.0, 17, 10},
                {-5.0, 2, 7}, {21.0, 28, 7},
                {-4.0, -1, 3}, {-8.0, -1, 7}
        };
    }
}
