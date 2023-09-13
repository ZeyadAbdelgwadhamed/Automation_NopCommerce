package Pages;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchProduct extends BasePage{

    public SearchProduct(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="small-searchterms")
    WebElement SearchTxtBox;
    @FindBy(css = "button.button-1.search-box-button")
    WebElement SearchButton;
    @FindBy(id = "ui-id-1")
    List<WebElement> AutoSearchBox;
//    WebElement AutoSearchBox;

    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[2]/button[1]")
    WebElement AddToCartButton;
    public void UserCanMakeSearchForItems(String SearchString) throws InterruptedException {
        SendElements(SearchTxtBox,SearchString);
        ClickingElements(SearchButton);
       Thread.sleep(3000);
        ClickingElements(AddToCartButton);
    }


    public void SearchAutomaticProductItems(String Items ){
        SendElements(SearchTxtBox,Items);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ClickingElements(AutoSearchBox.get(0));

    }

}
