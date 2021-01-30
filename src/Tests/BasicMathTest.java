import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BasicMathTest {

    @Test
    public void testAdd() {
        BasicMath math = new BasicMath();

        int a = 6;
        int b = 11;

        int expectedResult = a + b;
        int  actualResult = math.add(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSubtract() {
        BasicMath math = new BasicMath();

        int a = 6;
        int b = 11;

        int expectedResult = a - b;
        int  actualResult = math.subtract(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultiply() {
        BasicMath math = new BasicMath();

        int a = 6;
        int b = 11;

        int expectedResult = a * b;
        int  actualResult = math.multiply(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDivide() {
        BasicMath math = new BasicMath();

        double a = 6.0;
        double b = 11.0;

        double expectedResult = a / b;
        double  actualResult = math.divide(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }
}