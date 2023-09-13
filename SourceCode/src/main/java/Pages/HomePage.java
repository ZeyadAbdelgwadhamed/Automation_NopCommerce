package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    WebElement RegistrationPageElement;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]")
    WebElement ShoppingCartElement;
    @FindBy(linkText = "Contact us")
    WebElement ContactUsButton;
    @FindBy(id = "customerCurrency")
    WebElement ChangeCurrencyBox;
    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    WebElement LoginButton;
    @FindBy(linkText = "My account")
    WebElement MyAccountElement;

    public RegistrationPage RegistrationPageButton() {
        ClickingElements(RegistrationPageElement);
        return new RegistrationPage(driver);
    }

    public void ScrollDown(WebDriver driver)
    {
        ScrollDown(driver);
        ClickingElements(ContactUsButton);
    }


    public void ChangeTheCurrency()
    {
        Select select=new Select(ChangeCurrencyBox);
        select.selectByVisibleText("Euro");

    }

    public LoginPage OpenLoginPage()
    {
        ClickingElements(LoginButton);
        return new LoginPage(driver);
    }

    public MyAccount MyAccountPageButton()
    {
        ClickingElements(MyAccountElement);
        return  new MyAccount(driver);
    }

//    public void ShoppingCartPage()
//    {
//        ClickingElements(ShoppingCartElement);
//    }

}
