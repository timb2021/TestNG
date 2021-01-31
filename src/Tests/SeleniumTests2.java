import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import java.lang.reflect.Method;

public class SeleniumTests2 extends MainClass{

    @Test(testName = "Amazon test", groups = "group1")
    public void test2(Method method) {
        driver.get("https://amazon.com");

        Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");

        Test test = method.getAnnotation(Test.class);
        System.out.println(test.testName());
        System.out.println(test.description());
    }

    @Test(testName = "TLA Alert test", groups = "group1")
    public void test3() {
        driver.get("http://automation.techleadacademy.io");

        driver.findElement(By.xpath("(//a[@class='navbar-brand ml-3'])[4]")).click();

        Assert.assertEquals(driver.getCurrentUrl(), "http://automation.techleadacademy.io/#/alert");
    }

    @Test(testName = "Orbitz test", groups = "group1")
    public void test4() {
        driver.get("https://www.orbitz.com");
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='uitk-type-300' and text()='Sign in'] ")).isEnabled());

    }

}

