import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class SeleniumTests {

    // Check if method throwing an expected exception

    @Test(testName = "Check Exception", enabled = false)                // enabled = false - skip test
    public void checkException() {
        System.setProperty("webdriver.chrome.driver", "/Users/tim/Desktop/TechLeadAcademy/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://automation.techleadacademy.io");

        Assert.assertThrows(NoSuchElementException.class, () -> driver.findElement(By.xpath("//*[text()='Kuba']")));

        driver.close();
    }

    @Test(testName = "Google Test", description = "Testing title of the main page")
    public void test1(Method method) {
        System.setProperty("webdriver.chrome.driver", "/Users/tim/Desktop/TechLeadAcademy/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.close();

        System.out.println(method.getName());
        Test test = method.getAnnotation(Test.class);
        System.out.println(test.testName());
        System.out.println(test.description());

    }

    @Test(testName = "Amazon test", description = "Testing title of the main page")
    public void test2(Method method) {
        System.setProperty("webdriver.chrome.driver", "/Users/tim/Desktop/TechLeadAcademy/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://amazon.com");

        Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");

        driver.close();

        Test test = method.getAnnotation(Test.class);
        System.out.println(test.testName());
        System.out.println(test.description());
    }


    @Test(testName = "TLA Alert test", enabled = true)
    public void test3() {
        System.setProperty("webdriver.chrome.driver", "/Users/tim/Desktop/TechLeadAcademy/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://automation.techleadacademy.io");

        driver.findElement(By.xpath("(//a[@class='navbar-brand ml-3'])[4]")).click();

        Assert.assertEquals(driver.getCurrentUrl(), "http://automation.techleadacademy.io/#/alert");

        driver.close();
    }

    @Test(testName = "Orbitz test", priority = 1)
    public void test4() {
        System.setProperty("webdriver.chrome.driver", "/Users/tim/Desktop/TechLeadAcademy/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.orbitz.com");

        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='uitk-type-300' and text()='Sign in'] ")).isEnabled());

        driver.close();
    }

    @Test
    @Parameters({"input1", "input2"})              // need to run from testng.xml
    void parameterTest(String s1, String s2) {
        System.setProperty("webdriver.chrome.driver", "/Users/tim/Desktop/TechLeadAcademy/Selenium/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://automation.techleadacademy.io/#/inputs");

        WebElement inputField1 = driver.findElement(By.id("a"));
        WebElement inputField2 = driver.findElement(By.id("b"));
        WebElement btn = driver.findElement(By.name("button2"));
        inputField1.sendKeys(s1);
        inputField2.sendKeys(s2);
        btn.click();
        driver.close();
    }

    @Test
    @Parameters({"username1", "password1"})       // need to run from testng.xml
    void parameterTest2(@Optional("John") String username, @Optional("John123!") String password){
        System.out.println(username + " ---- " + password);
    }


}




/*



 //Check if method throwing an expected exception
    @Test(enabled = false)
    public void checkException(Method method){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Projects/TLA/Selenium/B-3/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io");
        Assert.assertThrows(NoSuchElementException.class, () -> driver.findElement(By.xpath("//*[text()='Apple']")));
        driver.close();
        System.out.println(method.getName());
    }
    //@Test(expectedExceptions = {NoSuchElementException.class, NoAlertPresentException.class})
    @Test(expectedExceptions = {NoSuchElementException.class})
    public void checkException2(Method method){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Projects/TLA/Selenium/B-3/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io");
        WebElement element = driver.findElement(By.xpath("//*[text()='Apple']"));
        Assert.assertTrue(true);
        driver.close();
        System.out.println(method.getName());
    }
    @Test(testName = "Google Test", description = "Testing title of the main page")
    public void test1(Method method){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Projects/TLA/Selenium/B-3/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.close();
        System.out.println(method.getName());
        Test test = method.getAnnotation(Test.class);
        System.out.println(test.testName());
        System.out.println(test.description());
    }
    @Test(testName = "Amazon Test")
    public void test2(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Projects/TLA/Selenium/B-3/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://amazon.com");
        Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
        driver.close();
    }
    @Test(testName = "TLA Test")
    public void test3(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Projects/TLA/Selenium/B-3/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automation.techleadacademy.io");
        driver.findElement(By.linkText("Alert")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "http://automation.techleadacademy.io/#/alert");
        driver.close();
    }
    @Test(testName = "Orbitz Test")
    public void test4(){
        System.setProperty("webdriver.chrome.driver", "/Users/kuba/Projects/TLA/Selenium/B-3/libs/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://orbitz.com");
        WebElement signInBtn = driver.findElement(By.xpath("//div[@class='uitk-type-300' and text()='Sign in']"));
        Assert.assertTrue(signInBtn.isEnabled());
        driver.close();
    }
 */