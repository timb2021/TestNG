import org.testng.Assert;
import org.testng.annotations.Test;

public class StringManipulationMethodsTest {

    @Test
    public void testReturnInitialsInCaps1() {

        StringManipulationMethods str = new StringManipulationMethods();
        String name = "banana";

        String actualResult = str.returnInitialsInCaps(name);
        String expectedResult = "B";

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testReturnInitialsInCaps2() {

        StringManipulationMethods str = new StringManipulationMethods();
        String name = "tim balaban";

        String actualResult = str.returnInitialsInCaps(name);
        String expectedResult = "TB";

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testReturnInitialsInCaps3() {

        StringManipulationMethods str = new StringManipulationMethods();
        String name = "";

        String actualResult = str.returnInitialsInCaps(name);
        String expectedResult = "";

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testReturnInitialsInCaps4() {

        StringManipulationMethods str = new StringManipulationMethods();
        String name = "teach lead academy";

        String actualResult = str.returnInitialsInCaps(name);
        String expectedResult = "TLA";

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testReturnInitialsInCaps5() {

        StringManipulationMethods str = new StringManipulationMethods();
        String name = "Teach Lead Academy";

        String actualResult = str.returnInitialsInCaps(name);
        String expectedResult = "TLA";

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testReturnInitialsInCaps6() {

        StringManipulationMethods str = new StringManipulationMethods();
        String name = "teach Lead academy Test testng Dev";

        String actualResult = str.returnInitialsInCaps(name);
        String expectedResult = "TLATTD";

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testReturnInitialsInCaps7() {

        StringManipulationMethods str = new StringManipulationMethods();
        String name = "T";

        String actualResult = str.returnInitialsInCaps(name);
        String expectedResult = "T";

        Assert.assertEquals(actualResult, expectedResult);

    }

}