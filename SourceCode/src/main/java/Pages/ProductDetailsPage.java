package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage{
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "strong.current-item")
    public   WebElement ProductName;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[8]/div[2]/button")    ////////////////////edit////
    WebElement AddToCart;

    @FindBy(css="button.button-2.product-box-add-to-cart-button")
    WebElement AddToCartWhenChangeCurrentBox;
    @FindBy(id="price-value-4")
    public WebElement PriceText;
    @FindBy(linkText = "Add your review")
    WebElement AddYourReview;
    public void UserCanAddToCart() throws InterruptedException {
        Thread.sleep(2000);
        ClickingElements(AddToCart);
    }
    public void AddToCartWhenChangeCurrent()
    {
        ClickingElements(AddToCartWhenChangeCurrentBox);
    }
    public void AddYourReviewButton()
    {
        ClickingElements(AddYourReview);
    }


}
