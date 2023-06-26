package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {
    private WebDriver driver;
    @FindBy(id = "APjFqb")
    public WebElement searchField;

    @FindBy(className = "gNO89b")
    public WebElement clickSearchGoogleButton;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeInSearchField(String text) {
        searchField.sendKeys(text);
    }

    public void clickSearchButton() {
        clickSearchGoogleButton.click();
    }

}
