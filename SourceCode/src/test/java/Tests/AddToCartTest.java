package Tests;

import Pages.AddToCart;
import Pages.Checkout;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest{
    AddToCart addToCart;
    Checkout checkout;

    @Test
    public void UserCanAddItemsToCart() throws InterruptedException {
         addToCart=new AddToCart(driver);
         checkout=new Checkout(driver);
         addToCart.UserCanAddToCart();
         addToCart.UserCanGoToCart();
         addToCart.UserCanMakeRegisterAndLoginTOCheckOut();
         checkout.UserCanOpenSoppingCartAndMakeCheckout();
         checkout.BallingData("Gzzza","GIzzzZA","123334","012224");
         Thread.sleep(3000);
         checkout. AllButtons();
        Assert.assertTrue(checkout.OrderSuccessfullyAssertion.getText().contains("Your order has been successfully processed!"));

    }
}
