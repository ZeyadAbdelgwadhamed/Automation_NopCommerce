package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends  BasePage{
    public AddToCart(WebDriver driver) {
        super(driver);
    }
    SearchProduct searchProduct;
    ProductDetailsPage productDetailsPage;
    HomePage homePage;
    LoginPage loginPage;
    AddToProductReview addToProductReview;
    RegistrationPage registrationPage;
    @FindBy(xpath = "/html/body/div[5]/div/p/a")
    WebElement ShoppingCart;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/div[3]/input")
    WebElement AgreeConditionBox;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/div[4]/button")
    WebElement CheckoutElement;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[2]")
    WebElement RegisterButton;
    @FindBy(xpath = "//*[@id=\"topcartlink\"]/a/span[1]")
    WebElement SoppingCartPageButton;

    public void UserCanAddToCart() throws InterruptedException {
        searchProduct=new SearchProduct(driver);
        productDetailsPage=new ProductDetailsPage(driver);
        searchProduct.UserCanMakeSearchForItems("Apple Mac");
        Thread.sleep(4000);
        productDetailsPage.UserCanAddToCart();
    }
    public void UserCanGoToCart() throws InterruptedException {
        Thread.sleep(2000);
        ClickingElements(ShoppingCart);
        ClickingElements(AgreeConditionBox);
        ClickingElements(CheckoutElement);

    }

    public void UserCanMakeRegisterAndLoginTOCheckOut()
    {
        registrationPage=new RegistrationPage(driver);
        addToProductReview=new AddToProductReview(driver);
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);
        ClickingElements(RegisterButton);
        registrationPage.RegistrationPageElements("Zeyad","Abs","Frenszzz111@gmail.com","ITI","1111ZZZZ","1111ZZZZ");
        registrationPage.RegisterButtonClicking();
        homePage.OpenLoginPage();
        loginPage.UserLogin("Frenszzz111@gmail.com","1111ZZZZ");
//        loginPage.UserLoginButton();
    }
    public void OpenSoppingCart()
    {
       ClickingElements(SoppingCartPageButton);
    }
}
