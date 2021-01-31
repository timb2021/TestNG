import org.testng.Assert;
import org.testng.annotations.Test;

public class RawTests {

    @Test(invocationCount = 5)      // (invocationCount = 5) print 5 times (like a loop)
    void invocationCountTest() {
        System.out.println("Test is executed...");

    }

    @Test(invocationTimeOut = 5000, invocationCount = 5)      //
    void invocationTimeOutTest() {
        System.out.println("Test is executed...");
    }

    @Test(timeOut = 5000)
    void timeOutTest() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Test(invocationCount = 5, skipFailedInvocations = true)
    void invocationCountTest2() {
        System.out.println("Test is executed...");
        Assert.fail();
    }

}
