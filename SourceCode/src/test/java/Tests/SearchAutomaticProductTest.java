package Tests;

import Pages.ProductDetailsPage;
import Pages.SearchProduct;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchAutomaticProductTest extends BaseTest{
    SearchProduct searchProduct;
    ProductDetailsPage productDetailsPage;

    @Test
    public void SearchAutomaticProductValid() throws InterruptedException {
       searchProduct=new SearchProduct(driver);
       productDetailsPage=new ProductDetailsPage(driver);
       Thread.sleep(3000);
       searchProduct.SearchAutomaticProductItems("Apple MacBook");
       Thread.sleep(3000);
       Assert.assertTrue(productDetailsPage.ProductName.getText().contains("Apple MacBook Pro 13-inch"));
       productDetailsPage.UserCanAddToCart();

    }
}
