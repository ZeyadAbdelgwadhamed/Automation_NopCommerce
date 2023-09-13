package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="Email")
    WebElement EmailTexBox;
    @FindBy(id ="Password")
    WebElement PassTxtBox;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    WebElement LoginButton;
    public void UserLogin(String Email,String Pass)
    {
        SendElements(EmailTexBox,Email);
        SendElements(PassTxtBox,Pass);
        ClickingElements(LoginButton);

    }
//    public void UserLoginButton()
//    {
//        ClickingElements(LoginButton);
//    }
}
