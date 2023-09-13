package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToProductReview extends BasePage{
    public AddToProductReview(WebDriver driver) {
        super(driver);
    }
    SearchProduct searchProduct;
    ProductDetailsPage productDetailsPage;
    RegistrationPage registrationPage;
    HomePage homePage;
    LoginPage loginPage;
//    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
//    WebElement RegisterElement;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")
    WebElement ContinueAfterRegister;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/input")
    WebElement ReviewTitleBox;
    @FindBy(id="AddProductReview_ReviewText")
    WebElement ReviewTextBox;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[2]/button")
    WebElement ReviewButton;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")
    WebElement ContinueButton;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
    public WebElement ConfirmedReviewMassage;
    public  void ContinueAfterRegisterButton()
    {
        ClickingElements(ContinueAfterRegister);

    }


    public void DeclarationObject ()
    {
        searchProduct=new SearchProduct(driver);
        productDetailsPage=new ProductDetailsPage(driver);
        registrationPage=new RegistrationPage(driver);
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);

    }

    public void AddToProductReviewAndRegister() throws InterruptedException {
        searchProduct.UserCanMakeSearchForItems("Apple Mac");
        Thread.sleep(3000);
        productDetailsPage.AddYourReviewButton();
        homePage.RegistrationPageButton();
        registrationPage.RegistrationPageElements("Zeyad","Abs","Ahmedadell@gmail.com","ITI","1111ZZZZ","1111ZZZZ");
        registrationPage.RegisterButtonClicking();
        ClickingElements(ContinueButton);
    }
    public void LoginToProductReview()
    {
        homePage.OpenLoginPage();
        loginPage.UserLogin("Ahmedadell@gmail.com","1111ZZZZ");
    }
    public void WriteYourReview() throws InterruptedException
    {
        Thread.sleep(4000);
        SendElements(ReviewTitleBox,"Test");
        SendElements(ReviewTextBox,"test11");
        ClickingElements(ReviewButton);

    }
}
