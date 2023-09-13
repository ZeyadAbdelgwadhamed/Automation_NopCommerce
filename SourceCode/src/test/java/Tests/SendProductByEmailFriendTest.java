package Tests;

import Pages.SendProductByEmailFriend;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SendProductByEmailFriendTest extends  BaseTest{
      SendProductByEmailFriend sendProductByEmailFriend;
      SoftAssert softAssert;

      @Test
    public void UserShouldSendEmailToFriend() throws InterruptedException {
          sendProductByEmailFriend=new SendProductByEmailFriend(driver);
          softAssert=new SoftAssert();
          sendProductByEmailFriend.UserCanMakeSearchForItems("Apple MacBook");
          sendProductByEmailFriend.RegistrationPageElements("zeyad","Abdo","zeyad3@gmail.com","ITI","12345ITI","12345ITI");
          sendProductByEmailFriend.UserLogin("zeyad3@gmail.com","12345ITI");
          softAssert.assertTrue(sendProductByEmailFriend.SearchAssertion.getText().contains("Search"));
          Thread.sleep(3000);
          sendProductByEmailFriend.AddToCardAfterRegisterAndLoginMethod();
          Thread.sleep(5000);
          sendProductByEmailFriend.MustToSendEmailFriend("ITI@gmail.com","this item you need it ");
          softAssert.assertTrue(sendProductByEmailFriend.SendToFriendAssertion.getText().contains("Your message has been sent."));
          softAssert.assertAll();
      }
}
