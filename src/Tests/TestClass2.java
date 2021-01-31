import org.testng.annotations.Test;

public class TestClass2 extends MainClass {
    @Test
    void test1() throws InterruptedException {
        driver.get("https://goal.com");
        Thread.sleep(2000);
    }
}
