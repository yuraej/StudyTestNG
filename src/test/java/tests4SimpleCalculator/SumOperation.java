package tests4SimpleCalculator;

import codeUnderTest.SimpleCalculator;
import com.sun.xml.internal.fastinfoset.util.StringArray;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class SumOperation extends BaseTest {
  /*  private SimpleCalculator calc;

    @BeforeClass
    public void getCopy() {
        calc = new SimpleCalculator();
    }*/

    @Test(priority = 1,
            groups = {"not simple", "the increment operation"},
            description = "check summarize operation with a lot of data in parallel execution",
            dataProvider = "dataForTest")
    public void checkSumOperation(double result, double number1, double number2) throws InterruptedException {
        assertEquals(result, calc.summarize(number1, number2));
        Thread.sleep(500);
    }

    @DataProvider(parallel = true)
    public Object[][] dataForTest() {
        return new Object[][]{
                {2.0, 1, 1},
                {4.0, 2, 2},
                {3.0, 3, 0},
                {6.0, 4, 2},
                {9.0, 2, 7},
                {2.0, -1, 3}
        };
    }
}
