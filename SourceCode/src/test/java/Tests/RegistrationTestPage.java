package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTestPage extends BaseTest{
   private HomePage homePage;
   private RegistrationPage registrationPage;
   private LoginPage loginPage;
    @Test (priority = 1 ,alwaysRun = true)
        public  void RegistrationValid() throws InterruptedException {
            homePage=new HomePage(driver);
            homePage.RegistrationPageButton();
            registrationPage =new RegistrationPage(driver);
            registrationPage.RegistrationPageElements("Anas1","Mahmoud","Anas2@gmail.com","iti","123456z","123456z");
            registrationPage.RegisterButtonClicking();
            Assert.assertTrue(registrationPage.MassageAfterRegister.getText().contains("Your registration completed"));
            Thread.sleep(3000);
        }

    @Test(priority = 2 , dependsOnMethods = "RegistrationValid")
        public void  UserLoginValid() throws InterruptedException {
          registrationPage.UserLoginAfterRegister();
          loginPage =new LoginPage(driver);
          loginPage.UserLogin("Anas2@gmail.com","123456z");
          Thread.sleep(3000);
          Assert.assertTrue(registrationPage.LogoutButton.getText().contains("Log out"));

        }

    @Test(priority = 3,dependsOnMethods = "UserLoginValid")
        public void UserLogout()
        {
            registrationPage.Logout();
        }
}
