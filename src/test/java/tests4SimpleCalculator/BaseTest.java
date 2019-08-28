package tests4SimpleCalculator;

import codeUnderTest.SimpleCalculator;
import org.testng.annotations.*;

public class BaseTest {
    SimpleCalculator calc = new SimpleCalculator();

    @BeforeSuite
    public void testBeforeSuite() {
        System.out.println("Привет это БифоСьют!!!\n эта надпись должна быть один раз при запуске теста или всех тестов");
    }

    @BeforeTest
    public void testBeforeTest() {
        System.out.println("Привет это БифоТест!!!\n эта надпись должна быть N раз при запуске теста или всех тестов,\n" +
                " ограниченных тегом <test> </test>в файле testng.xml");
    }

    @BeforeClass
    public void testBeforeClass() {
        System.out.println("Привет это БифоКласс!!!\n эта надпись должна быть один раз при запуске теста или всех тестов");
    }

    @BeforeGroups
    public void testBeforeGroups() {
        System.out.println("Привет это БифоГрупп!!! \n эта надпись должна быть один раз при запуске каждоый группы тестов");
    }

    @BeforeMethod
    public void testBeforeMethod() {
        System.out.println("Привет это БифоМетод!!!\n эта напдись должна быть при запуске каждого тестового метода");
    }
}
