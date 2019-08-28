package tests4SimpleCalculator;

import codeUnderTest.SimpleCalculator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RemainderDivide extends BaseTest {
   /* SimpleCalculator calc;

    @BeforeClass
    public void getCopy() {
        calc = new SimpleCalculator();
    }*/

    @Parameters({"result", "number1", "number2"})
    @Test(priority = 5,
            groups = {"simple test", "the reduction operation"},
            description = "check remainderDivide operation with data from testngFile")
    public void checkRemainderDivideOperation(double result, double number1, double number2) {
        assertEquals(result, calc.remainderDivide(number1, number2));
    }
}
