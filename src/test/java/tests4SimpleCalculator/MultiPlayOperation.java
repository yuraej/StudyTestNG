package tests4SimpleCalculator;

import codeUnderTest.SimpleCalculator;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

import static org.testng.AssertJUnit.assertEquals;

public class MultiPlayOperation extends BaseTest{
   /* SimpleCalculator calc;

    @BeforeClass
    public void getCopy() {
        calc = new SimpleCalculator();
    }*/

    @Test(priority = 1,
            groups = {"not simple", "the increment operation"},
            description = "check multi play  operation with a lot of data",
            dataProvider = "dataForTest",
            invocationCount = 3, threadPoolSize = 3)
    public void checkMultiPlayOperation(double result, double number1, double number2) throws InterruptedException {
        assertEquals(result, calc.multiply(number1, number2));
        Thread.sleep(1500);
    }

    @DataProvider(parallel = true)
    public Object[][] dataForTest() {
        return new Object[][]{
                {1.0, 1, 1}, {75.0, 15, 5},
                {4.0, 2, 2}, {50.0, 10, 5},
                {0.0, 3, 0}, {9.0, 3, 3},
                {8.0, 4, 2}, {170.0, 17, 10},
                {35.0, 5, 7}, {14.0, 2, 7},
                {-3.0, -1, 3}, {-7.0, -1, 7}
        };
    }
}
