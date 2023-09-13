package Tests;
import Pages.ProductDetailsPage;
import Pages.SearchProduct;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest extends BaseTest {
    private SearchProduct userCanSearchForItems;
    private ProductDetailsPage productDetailsPage;
    String SearchTitles="Apple MacBook Pro 13-inch";

    @Test
    public void UserSearchForItemsValid() throws InterruptedException {
        userCanSearchForItems=new SearchProduct(driver);
        productDetailsPage=new ProductDetailsPage(driver);
        userCanSearchForItems.UserCanMakeSearchForItems(SearchTitles);
        Thread.sleep(3000);
        Assert.assertTrue(productDetailsPage.ProductName.getText().contains("Apple MacBook Pro 13-inch"));

    }

}

