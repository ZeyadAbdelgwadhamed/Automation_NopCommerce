package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "gender-male")
    WebElement Gender;
    @FindBy(id = "FirstName")
    WebElement FNYxt;
    @FindBy(id = "LastName")
    WebElement LNTxt;
    @FindBy(id = "Email")
    WebElement EmailTxt;
    @FindBy(id = "Company")
    WebElement CompanyTxt;
    @FindBy(id = "Password")
    WebElement PasswordTxt;
    @FindBy(id = "ConfirmPassword")
    WebElement ConfirmPasswordTxt;
    @FindBy(id = "register-button")
    WebElement RegisterButton;
    public void RegistrationPageElements(String FName,String LName,String Email ,String Company , String Pass ,String ConfirmedPass )
    {
        ClickingElements(Gender);
        SendElements(FNYxt,FName);
        SendElements(LNTxt,LName);
        SendElements(EmailTxt,Email);
        SendElements(CompanyTxt,Company);
        SendElements(PasswordTxt,Pass);
        SendElements(ConfirmPasswordTxt,ConfirmedPass);


    }
    public void RegisterButtonClicking ()
    {
        ClickingElements(RegisterButton);
    }
    ////////////////Assertion
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
    public WebElement MassageAfterRegister;

    ////////////////////////////////
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    WebElement LoginButton;
    public LoginPage UserLoginAfterRegister()
    {
        ClickingElements(LoginButton);
          return new LoginPage(driver);
    }
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    public   WebElement LogoutButton;
    public void Logout()
    {
        ClickingElements(LogoutButton);
    }



}
