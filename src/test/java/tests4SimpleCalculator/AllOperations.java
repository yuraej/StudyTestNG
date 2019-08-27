package tests4SimpleCalculator;

import codeUnderTest.SimpleCalculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static org.testng.AssertJUnit.assertEquals;

@org.testng.annotations.Test(priority = 0,
        groups = "simple test",
        description = "run all operations with a single data pair",
        invocationCount = 3)
public class AllOperations extends BaseTest{
   /* SimpleCalculator calc;
    int counter = 1;

    @BeforeClass
    public void getCopy() {
        calc = new SimpleCalculator();
        System.out.println("Запускаем тестовый класс");
    }

    @AfterClass
    public void endTestClass() {
        System.out.println("Тестовый класс отработал");
    }

    @BeforeMethod
    public void startTest() {
        System.out.println("Запускаем тест номер " + counter);
        counter++;
    }

    @AfterMethod
    public void endTest() {
        System.out.println("Тест номер " + (counter - 1) + " отработал");
    }*/

    public void checkSumOperation() {
        assertEquals(3.0, calc.summarize(1, 2));
    }

    public void checkDeductOperation() {
        assertEquals(0.0, calc.deduct(2, 2));
    }

    public void checkMultiPlyOperation() {
        assertEquals(2.0, calc.multiply(1, 2));
    }

    public void checkDivideOperation() {
        assertEquals("0,50", calc.divide(1, 2));
    }

    public void checkRemainderDivideOperation() {
        assertEquals(calc.remainderDivide(5, 2), 1.0);
    }
}
