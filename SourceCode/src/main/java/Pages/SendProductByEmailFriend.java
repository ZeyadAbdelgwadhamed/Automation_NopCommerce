package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendProductByEmailFriend extends BasePage {
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[1]")
    public WebElement AddToCartButton;
    HomePage homePage;
    @FindBy(id = "small-searchterms")
    WebElement SearchTxtBox;
    @FindBy(css = "button.button-1.search-box-button")
    WebElement SearchButton;
    @FindBy(xpath = "//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[3]/button")
    WebElement EmailPageButton;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    WebElement RegisterPageButton;
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
    WebElement ConfirmedRegisterButton;
    @FindBy(linkText = "Continue")
    WebElement ContinueAfterReg;
    ////////////////////////////
    @FindBy(id = "FriendEmail")
    WebElement EmailFriedTxtBox;
    @FindBy(id = "YourEmailAddress")
    WebElement YourEmailAddressTaxBox;
    @FindBy(id = "PersonalMessage")
    WebElement PersonalMessageTaxBox;
    @FindBy(name = "send-email")
    WebElement SendEmailButton;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    WebElement LoginPageButton;
    @FindBy(id = "Email")
    WebElement EmailTexBox;
    @FindBy(id = "Password")
    WebElement PassTxtBox;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
    WebElement LoginButton;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[1]")
    WebElement AddToCardButtonAfterRegisterAndLogin;
    //////////////////////////////////assertion///////////////
    @FindBy(className = "page-title")
    public WebElement SearchAssertion;
    @FindBy(className = "product-name")
    public WebElement ProductNameAssertion;
    @FindBy(xpath = "//div[@class='result']")
    public WebElement SendToFriendAssertion;
    public SendProductByEmailFriend(WebDriver driver) {
        super(driver);
    }

    public void UserCanMakeSearchForItems(String SearchString) {
        SendElements(SearchTxtBox, SearchString);
        ClickingElements(SearchButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Code to handle the InterruptedException
            System.out.println("Thread sleep interrupted: " + e.getMessage());
        }
//        ClickingElements(AddToCartButton);
    }

    public void RegistrationPageElements(String FName, String LName, String Email, String Company, String Pass, String ConfirmedPass) {

        ClickingElements(RegisterPageButton);
        ClickingElements(Gender);
        SendElements(FNYxt, FName);
        SendElements(LNTxt, LName);
        SendElements(EmailTxt, Email);
        SendElements(CompanyTxt, Company);
        SendElements(PasswordTxt, Pass);
        SendElements(ConfirmPasswordTxt, ConfirmedPass);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Code to handle the InterruptedException
            System.out.println("Thread sleep interrupted: " + e.getMessage());
        }
        ClickingElements(ConfirmedRegisterButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Code to handle the InterruptedException
            System.out.println("Thread sleep interrupted: " + e.getMessage());
        }
//        ClickingElements(ContinueAfterReg);
    }

    public void UserLogin(String Email, String Pass) {
        ClickingElements(LoginPageButton);
        SendElements(EmailTexBox, Email);
        SendElements(PassTxtBox, Pass);
        ClickingElements(LoginButton);
    }

    public void AddToCardAfterRegisterAndLoginMethod() {
        ClickingElements(AddToCardButtonAfterRegisterAndLogin);
    }

    public void MustToSendEmailFriend(String EamilFriend,  String PersonalMassage) {

        ClickingElements(EmailPageButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            System.out.println("Thread sleep interrupted: " + e.getMessage());
        }
        SendElements(EmailFriedTxtBox, EamilFriend);
        SendElements(PersonalMessageTaxBox, PersonalMassage);
        ClickingElements(SendEmailButton);
    }

}
