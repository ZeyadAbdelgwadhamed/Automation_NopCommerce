package Tests;

import Pages.AddToProductReview;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewProductTest extends  BaseTest{
    AddToProductReview addToProductReview;
    @Test
    public void UserCanAddProductReview() throws InterruptedException {
        addToProductReview=new AddToProductReview(driver);
        addToProductReview.DeclarationObject();
        addToProductReview.AddToProductReviewAndRegister();
        addToProductReview.LoginToProductReview();
        addToProductReview.WriteYourReview();
        Assert.assertTrue(addToProductReview.ConfirmedReviewMassage.getText().contains("Product review is successfully added."));
    }
}
