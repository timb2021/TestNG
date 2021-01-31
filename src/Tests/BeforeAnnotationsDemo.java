import org.testng.annotations.*;

public class BeforeAnnotationsDemo {

    @BeforeSuite
    void beforeSuite(){
        System.out.println("This is a BEFORE Suite");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("This is a BEFORE Test");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("This is a BEFORE Class");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("This is a BEFORE Method");
    }
    @Test
    void test1(){
        System.out.println("This is a TestMethod 1");
    }
    @Test
    void test2(){
        System.out.println("This is a TestMethod 2");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("This is AFTER Suite");
    }
    @AfterTest
    void afterTest(){
        System.out.println("This is AFTER Test");
    }
    @AfterSuite
    void afterClass(){
        System.out.println("This is AFTER Class");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("This is AFTER Method");
    }
}
