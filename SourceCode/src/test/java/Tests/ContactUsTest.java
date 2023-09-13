package Tests;

import Pages.ContactUsPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends BaseTest {
    ContactUsPage contactUsPage;
    HomePage homePage;

    @Test
    public void UserCanMakeContactUsValid() {
        homePage = new HomePage(driver);
        contactUsPage = new ContactUsPage(driver);
        contactUsPage.UserCanMakeContactUsSuccessfully("Zeyad", "aa@gmail.com", "This first contact with you");
        Assert.assertTrue(contactUsPage.SuccessMassage.getText().contains("Your enquiry has been successfully sent to the store owner"));

    }
}
