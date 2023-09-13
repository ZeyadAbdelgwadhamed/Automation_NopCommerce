package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccount;
import Pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountPageTest extends BaseTest {
    private HomePage homePage;
    private RegistrationPage registrationPage;
    private LoginPage loginPage;
    private MyAccount myAccount;


    @Test (priority = 1)
    public  void UserCanMakeRegisterAndLoginAndLogout()throws InterruptedException
    {
        myAccount=new MyAccount(driver);
        registrationPage=new RegistrationPage(driver);
        loginPage=new LoginPage(driver);
        myAccount.UserCanRegisterAndLoginAfterChangeAccount();
        Assert.assertTrue(registrationPage.LogoutButton.getText().contains("Log out"));
        Thread.sleep(2000);

    }

    @Test(priority = 2)
    public void ChangeMyPasswordAndLoginAfterEdit() throws InterruptedException {
        homePage=new HomePage(driver);
        myAccount = new MyAccount(driver);
        homePage.MyAccountPageButton();
        myAccount.ChangePasswordPage();
        myAccount.MyAccountMethode("112345a", "123456aa", "123456aa");
        myAccount.CloseAletButton();
        myAccount.LogoutAfterEditPass();
        myAccount.UserLoginAfterEditPassAndRegister();
    }

}
