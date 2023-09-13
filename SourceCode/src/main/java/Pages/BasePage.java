package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.Selector;

public class BasePage {
    protected WebDriver driver ;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public static void  SelectElement (WebElement element, String string )
    {
       Select elector=new Select(element);
       elector.selectByVisibleText(string);
    }

    protected static void ClickingElements(WebElement element) {
        element.click();
    }

    protected static void SendElements(WebElement element, String txt) {
        element.sendKeys(txt);
    }




}
