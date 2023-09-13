package Tests;
import Utilits.ScreenShoots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    @Parameters({"Browser"})
    @BeforeClass
    public void StaringTest(@Optional("Edge") String Browser)
    {
        if(Browser.equalsIgnoreCase("edge"))
            {
                System.setProperty("Webdriver.Edge.driver",
                        System.getProperty("User.dir")+"/Drivers/msedgedriver.exe");
            }
        else if (Browser.equalsIgnoreCase("chrome"))
            {
                System.setProperty("Webdriver.chrome.driver",
                        System.getProperty("User.dir")+"/Drivers/chromedriver.exe");
            }
//        System.setProperty("webdriver.edge.driver",
//                "F:\\Automation_Test\\LastVersionNepCommerceMotaze\\Drivers\\msedgedriver.exe");
                driver =new EdgeDriver();
                driver.manage().timeouts().implicitlyWait(4000, TimeUnit.NANOSECONDS);
                driver.manage().window().maximize();
                driver.get("https://demo.nopcommerce.com/");

    }

    @AfterMethod
    public void TackScreenWhenFiledTestCase(ITestResult result)
    {
        if (result.getStatus()==ITestResult.FAILURE)
        {
            System.out.println("TakeScreenShoot");
            ScreenShoots.TakeScreenShoots(driver,result.getName());
        }
    }
    @AfterClass
    public void CloseTest()
    {
        driver.quit();
    }

}
