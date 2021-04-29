package helloworldtest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import helloworld.JUnitHelloWorld;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitHelloWorldTest {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void isGreaterTest() {
        System.out.println("Test 1");
        JUnitHelloWorld helloWorld = new JUnitHelloWorld();
        int num1 = 7 ;
        int num2 = 3 ;
        assertTrue("Number "+num1+" is not greater than Number "+num2, helloWorld.isGreater(num1, num2));
    }
    @Test
    public void isEvenTest() {
        System.out.println("Test 2");
        JUnitHelloWorld helloWorld = new JUnitHelloWorld();
        int number = 8;
        assertTrue("The Number "+number+" is not Even", helloWorld.isEven(number));
    }

    @Test
    public void isOddTest() {
        System.out.println("Test 3");
        JUnitHelloWorld helloWorld = new JUnitHelloWorld();
        int number = 7;
        assertEquals(number, helloWorld.isOdd(number));
    }

    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
