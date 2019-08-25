package tests4SimpleCalculator;

import codeUnderTest.SimpleCalculator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.AssertJUnit.assertEquals;

public class DivideOperation {
    SimpleCalculator calc;
    Random random = new Random();

    @BeforeClass
    public void getCopy() {
        calc = new SimpleCalculator();
    }

    @Test(priority = 3,
            groups = {"simple test", "the reduction operation"},
            description = "checks for an error message",
            expectedExceptions = {AssertionError.class},
            invocationCount = 5)
    public void checkDivideOperationByInvocationCount() {
        assertEquals("1,00", calc.divide(1, random.nextInt(3)));
    }

    @Test(priority = 3,
            groups = {"simple test", "the reduction operation"},
            description = "checks for an error message",
            retryAnalyzer = Retry.class)
    public void checkDivideOperationByRetryAnalyzer() {
        assertEquals("1,00", calc.divide(1, random.nextInt(3)));
    }
}
