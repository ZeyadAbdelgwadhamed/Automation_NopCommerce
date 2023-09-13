package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.security.cert.X509Certificate;

public class Checkout extends BasePage{
    public Checkout(WebDriver driver) {
        super(driver);
    }
    AddToCart addToCart;
    @FindBy(xpath = "//*[@id=\"shopping-cart-form\"]/div[3]/div[2]/div[3]/label")
    WebElement IAgreeBox;
    @FindBy(xpath = "//*[@id=\"checkout\"]")
    WebElement CheckoutButton;
    @FindBy(id="BillingNewAddress_CountryId")
     WebElement ChoseCountry;


    @FindBy(xpath = "//*[@id=\"BillingNewAddress_City\"]")
    WebElement CityBox;
    @FindBy(xpath = "//*[@id=\"BillingNewAddress_Address1\"]")
    WebElement AddressBox;
    @FindBy(xpath = "//*[@id=\"BillingNewAddress_ZipPostalCode\"]")
    WebElement PostCodeBox;
    @FindBy(xpath = "//*[@id=\"BillingNewAddress_PhoneNumber\"]")
    WebElement PhoneBox;
    @FindBy(css="button[onclick=\"Billing.save()\"]")
    WebElement ContinueButton;
    @FindBy(css= "button[onclick=\"ShippingMethod.save()\"]")
    WebElement ContinueButtonToPayment;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button")

    WebElement ContinueButtonToPaymentInfo;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button")

    WebElement ContinueButtonToPaymentToConfirm;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button")
    WebElement ConfirmButton;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")
    public WebElement OrderSuccessfullyAssertion;


    public void UserCanOpenSoppingCartAndMakeCheckout()
    {
        addToCart=new AddToCart(driver);
        addToCart.OpenSoppingCart();
        ClickingElements(IAgreeBox);
        ClickingElements(CheckoutButton);

    }
    public void BallingData(String City,String Adders,String Post,String Phone) throws InterruptedException {
        SendElements(ChoseCountry,"Egypt");
        SendElements(CityBox,City);
        SendElements(AddressBox,Adders);
        SendElements(PostCodeBox,Post);
        SendElements(PhoneBox,Phone);
//        Thread.sleep(3000);
    }
     public  void  AllButtons() throws InterruptedException {
         ClickingElements(ContinueButton);
         Thread.sleep(2000);
         ClickingElements(ContinueButtonToPayment);
         Thread.sleep(2000);
         ClickingElements(ContinueButtonToPaymentInfo);
         Thread.sleep(2000);
         ClickingElements(ContinueButtonToPaymentToConfirm);
         Thread.sleep(2000);
         ClickingElements(ConfirmButton);
         Thread.sleep(2000);
     }


}
