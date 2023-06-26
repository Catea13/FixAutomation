package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {
    private WebDriver driver;
    @FindBy(id = "APjFqb")
    public WebElement searchField;


    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }


    public void typeInSearchField(String text) {
        searchField.sendKeys(text);
    }


}
