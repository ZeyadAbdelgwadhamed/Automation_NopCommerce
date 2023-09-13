package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage{

    public MyAccount(WebDriver driver) {
        super(driver);
    }
    RegistrationPage registrationPage;
    LoginPage loginPage;
    HomePage homePage;

    @FindBy(linkText = "Change password")
    WebElement ChangePassElement;
    @FindBy(id="OldPassword")
    WebElement OldPasswordTexBOX;
    @FindBy(id = "NewPassword")
    WebElement  NewPasswordTexBOX;
    @FindBy(id = "ConfirmNewPassword")
    WebElement ConfirmPassTexBOX;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/button")
    WebElement ChangePasswordElement;
    @FindBy(css ="span[title=Close]")
    WebElement CloseAlert;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    public   WebElement LogoutButton;  ///// المفروف تكون في ال هوم
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    WebElement LoginAfterEditPassButton;

    public  void UserCanRegisterAndLoginAfterChangeAccount()throws InterruptedException
    {

            homePage =new HomePage(driver);
            loginPage=new LoginPage(driver);
            registrationPage=new RegistrationPage(driver);
            Thread.sleep(2000);
            homePage.RegistrationPageButton();
            registrationPage.RegistrationPageElements("zeyad","Abd","zeyadabd@gmail.com","ITI","112345a","112345a");
            registrationPage.RegisterButtonClicking();
            homePage.OpenLoginPage();
            loginPage.UserLogin("zeyadabd@gmail.com","112345a");

    }



        public void ChangePasswordPage()
        {
            ClickingElements(ChangePassElement);
        }
        public void MyAccountMethode(String OldPass,String NewPass,String ConfirmPass)
        {
           SendElements(OldPasswordTexBOX,OldPass);
           SendElements(NewPasswordTexBOX,NewPass);
           SendElements(ConfirmPassTexBOX,ConfirmPass);
            ClickingElements(ChangePasswordElement);

        }

//    public void ChangePasswordElementMethode()
//    {
//
//    }

    public void CloseAletButton()
    {
        ClickingElements(CloseAlert);
    }


        public void LogoutAfterEditPass()
        {
            ClickingElements(LogoutButton);
        }

        public LoginPage UserLoginAfterEditPassAndRegister()
        {
            ClickingElements(LoginAfterEditPassButton);
            return new LoginPage(driver);
        }


}
