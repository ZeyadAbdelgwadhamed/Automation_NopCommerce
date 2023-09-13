package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {
    @FindBy(css = "div.result")
    public WebElement SuccessMassage;
    @FindBy(css = "input.fullname")
    WebElement YourNameTxtBox;
    @FindBy(id = "Email")
    WebElement EmailTaxBox;
    @FindBy(id = "Enquiry")
    WebElement EnquiryTxtBox;
    @FindBy(name = "send-email")
    WebElement SubmitButton;
    @FindBy(linkText = "Contact us")
    WebElement ContactUsButton;
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public void UserCanMakeContactUsSuccessfully(String YourName, String Email, String Enquiry) {
        ClickingElements(ContactUsButton);
        SendElements(YourNameTxtBox, YourName);
        SendElements(EmailTaxBox, Email);
        SendElements(EnquiryTxtBox, Enquiry);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // Code to handle the InterruptedException
            System.out.println("Thread sleep interrupted: " + e.getMessage());
        }
        ClickingElements(SubmitButton);

    }

}
