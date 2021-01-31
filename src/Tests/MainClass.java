import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class MainClass {

    public WebDriver driver = null;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/tim/Desktop/TechLeadAcademy/Selenium/libs/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.close();
    }

}
