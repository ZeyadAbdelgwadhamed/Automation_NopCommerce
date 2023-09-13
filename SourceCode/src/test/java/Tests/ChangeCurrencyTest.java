package Tests;

import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.SearchProduct;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeCurrencyTest extends BaseTest{
    SearchProduct searchProduct;
    HomePage homePage;
    ProductDetailsPage productDetailsPage;
    @Test
    public void UserShouldChangeTheCurrency() throws InterruptedException {
        homePage=new HomePage(driver);
        searchProduct=new SearchProduct(driver);
        productDetailsPage=new ProductDetailsPage(driver);
        searchProduct.UserCanMakeSearchForItems("apple macBook");
        productDetailsPage.AddToCartWhenChangeCurrent();
        Thread.sleep(3000);
        homePage.ChangeTheCurrency();
        Assert.assertTrue(productDetailsPage.PriceText.getText().contains("€"));

    }

}
